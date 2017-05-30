package lab3;

import lab3.listeners.DeflistListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FunctionalTranslatior {

    public final static String INDENT = "  ";

    public static void main(String[] args) {
        try {
            CharStream charStream = new ANTLRInputStream(Files.newInputStream(Paths.get("input.txt")));
            lab3.FunctionalLexer lexer = new lab3.FunctionalLexer(charStream);
            TokenStream tokens = new CommonTokenStream(lexer);
            lab3.FunctionalParser parser = new lab3.FunctionalParser(tokens);

            DeflistListener listener = new DeflistListener();
            parser.deflist().enterRule(listener);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
