package lab4;

import lab4.listeners.GrammarFileContentListener;
import lab4.parser.GrammarFileLexer;
import lab4.parser.GrammarFileParser;
import lab4.utils.GRule;
import lab4.utils.GrammarInfo;
import lab4.utils.TopDownParsing;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static lab4.utils.GrammarInfo.getTokens;

public class GrammarTranslator {

    public static void main(String[] args) {
        new GrammarTranslator().run();
    }

    private void run() {
        parseGrammar("Expr.g4");
//        printRules();
//        printLexerFirst();
//        printGrammarFirst();
//        printGrammarFollow();
//        System.target.println();
//        printGrammarTokens();
        generateLexer();
    }

    private void parseGrammar(String grammarFileName) {
        try {
            CharStream charStream = new ANTLRInputStream(Files.newInputStream(Paths.get(grammarFileName)));
            GrammarFileLexer lexer = new GrammarFileLexer(charStream);
            TokenStream tokens = new CommonTokenStream(lexer);
            GrammarFileParser parser = new GrammarFileParser(tokens);

            GrammarFileContentListener listener = new GrammarFileContentListener();
            parser.grammarFileContent().enterRule(listener);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printRules() {
        String grammarName = GrammarInfo.getGrammarName();
        System.out.println(grammarName);
        List<GRule> grammarRules = GrammarInfo.getGrammarRules();
        grammarRules.forEach(rule -> {
            System.out.print(String.format("%s: ", rule.getName()));
            String str = rule.getAlts().stream()
                    .map(list -> list.stream().collect(Collectors.joining(" ")))
                    .collect(Collectors.joining(","));
            System.out.println(str);
        });
    }

    private void printLexerFirst() {
        Map<String, Set<Character>> first = TopDownParsing.buildLexerFirst(GrammarInfo.getLexerTokens());
        printMap(first, "Lexer FIRST:");
    }

    private void printGrammarFirst() {
        Map<String, Set<Character>> first = TopDownParsing.buildGrammarFirst(
                GrammarInfo.getGrammarRules(),
                GrammarInfo.getLexerTokens());
        printMap(first, "Grammar FIRST:");
    }

    private void printGrammarFollow() {
        Map<String, Set<Character>> follow = TopDownParsing.buildGrammarFollow(
                GrammarInfo.getGrammarRules(),
                GrammarInfo.getLexerTokens());
        printMap(follow, "Grammar FOLLOW:");
    }

    private void printGrammarTokens() {
        if (getTokens().isEmpty()) {
            GrammarInfo.evalTokens();
        }
        getTokens().forEach(System.out::println);
    }

    private void printMap(Map<String, Set<Character>> first, String msg) {
        System.out.println(msg);
        first.forEach((k, vals) -> {
            String set = vals.stream().map(e -> e + "").collect(Collectors.joining(","));
            System.out.println(String.format("%s: [%s]", k, set));
        });
    }

    private void generateLexer() {
        String className = GrammarInfo.getGrammarName() + "LexicalAnalyzer";
        try (BufferedWriter out = new BufferedWriter(Files.newBufferedWriter(Paths.get(
                String.format("target/%s.java", className))))) {
            StringBuilder st = new StringBuilder();
            st.append("package lab4.target;\n" +
                    "\n" +
                    "import java.io.IOException;\n" +
                    "import java.io.InputStream;\n" +
                    "import java.text.ParseException;\n\n\n"
            );

            GrammarInfo.evalTokens();
            Map<String, Set<Character>> tokensFirst = TopDownParsing.buildLexerFirst(GrammarInfo.getLexerTokens());
            for (String token : GrammarInfo.getTokens()) {
                HashSet<Character> set = new HashSet<>();
                set.add(token.charAt(0));
                tokensFirst.put(token, set);
            }
            List<String> tmp = new ArrayList<>();
            for (int i = 0; i < tokensFirst.size(); i++) {
                tmp.add("T_" + i);
            }
            st.append(String.format("enum Token {\n    %s;\n}\n\n", tmp.stream().collect(Collectors.joining(", "))));

            st.append("public class " + className + " {\n" +
                    "    private InputStream is;\n" +
                    "    private int curChar;\n" +
                    "    private int curPos;\n" +
                    "    private Token curToken;\n" +
                    "\n" +
                    "    public " + className + "(InputStream is) throws ParseException {\n" +
                    "        this.is = is;\n" +
                    "        curPos = 0;\n" +
                    "        nextChar();\n" +
                    "    }\n" +
                    "\n" +
                    "    private void nextChar() throws ParseException {\n" +
                    "        curPos++;\n" +
                    "        try {\n" +
                    "            curChar = is.read();\n" +
                    "        } catch (IOException e) {\n" +
                    "            throw new ParseException(e.getMessage(), curPos);\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    private boolean isBlank(int c) {\n" +
                    "        return c == ' ' || c == '\\n' || c == '\\t' || c == '\\r';\n" +
                    "    }\n" +
                    "\n" +
                    "    public Token curToken() {\n" +
                    "        return curToken;\n" +
                    "    }\n" +
                    "\n" +
                    "    public int curPos() {\n" +
                    "        return curPos;\n" +
                    "    }\n" +
                    "\n" +
                    "    public void nextToken() throws ParseException {\n" +
                    "        while (isBlank(curChar)) {\n" +
                    "            nextChar();\n" +
                    "        }\n" +
                    "\n" +
                    "        switch (curChar) {\n"
            );
            int i = 0;
            for (Map.Entry<String, Set<Character>> e : tokensFirst.entrySet()) {
                for (Character c : e.getValue()) {
                    st.append("            case '" + c + "':\n");
                }
                tmp = e.getValue().stream()
                        .map(x -> String.format("curChar == '%s'", Character.toString(x)))
                        .collect(Collectors.toList());
                // todo add attr
                st.append("                while (" + tmp.stream().collect(Collectors.joining(" || ")) + ")\n" +
                        "                    nextChar();\n" +
                        "                curToken = " + "Token.T_" + i + "; // " + e.getKey() + "\n" +
                        "                break;\n"
                );

                ++i;
            }
            st.append("            default:\n" +
                    "                throw new ParseException(\"Illegal character \" + curChar, curPos);\n"
            );


            st.append("        }\n");
            st.append("    }\n");
            st.append("}");
            out.write(st.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
