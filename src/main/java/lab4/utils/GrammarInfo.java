package lab4.utils;

import java.util.*;
import java.util.stream.Collectors;

public class GrammarInfo {
    private static String grammarName;
    private static List<GRule> grammarRules = new ArrayList<>();
    private static List<LRule> lexerTokens = new ArrayList<>();
    private static Set<String> tokens = new HashSet<>();

    public static void setGrammarName(String name) {
        grammarName = name;
    }

    public static String getGrammarName() {
        return grammarName;
    }

    public static void addGrammarRule(GRule rule) {
        grammarRules.add(rule);
    }

    public static List<GRule> getGrammarRules() {
        return grammarRules;
    }

    public static void addLexerToken(LRule token) {
        lexerTokens.add(token);
    }

    public static List<LRule> getLexerTokens() {
        return lexerTokens;
    }

    public static void evalTokens() {
        tokens = grammarRules.stream()
                .map(Rule::getAlts)
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .filter(str -> str.startsWith("'") && str.endsWith("'"))
                .map(str -> str.substring(1, str.length() - 1))
                .collect(Collectors.toSet());
    }

    public static Set<String> getTokens() {
        return tokens;
    }
}
