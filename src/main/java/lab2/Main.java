package lab2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

/**
 * @author Lebedev Roman (lebedeffroman@gmail.com)
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        try (InputStream is = new FileInputStream("in.txt")) {
            Parser p = new Parser();
            Tree parseTree = p.parse(is);
            Tree.dumpParseTree(parseTree, "out/dump.txt");
        }
    }
}
