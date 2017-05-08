package lab2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author Lebedev Roman (lebedeffroman@gmail.com)
 * @version 1.0
 */
public class Tree {
    private static int cursor;

    private String node;
    private List<Tree> children;


    public Tree(String node) {
        this.node = node;
        this.children = Collections.emptyList();
    }

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    /**
     * Walks the <b>tree</b> with dfs and dumps it`s structure to the relative path <b>filename</b>.
     */
    public static void dumpParseTree(Tree tree, String fileName) throws FileNotFoundException {
        cursor = 0;
        try (PrintWriter pw = new PrintWriter(fileName)) {
            dump(tree, pw);
        }
    }

    /**
     * Walks the <b>tree</b> with dfs and dumps it`s structure to <b>pw</b>.
     *
     * @return Index of itself.
     */
    private static int dump(Tree tree, PrintWriter pw) {
        int curInd = cursor++;
        pw.println(String.format("node:ind=%d;name=%s;shape=%s;style=%s;color=%s", curInd, tree.node,
                tree.children.isEmpty() ? "doublecircle" : "rect",
                tree.children.isEmpty() ? "filled" : "",
                tree.children.isEmpty() ? "green" : ""));
        for (Tree child : tree.children) {
            int to = dump(child, pw);
            pw.println(String.format("edge:fromInd=%d;toInd=%d", curInd, to));
        }
        return curInd;
    }
}
