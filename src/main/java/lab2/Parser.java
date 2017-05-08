package lab2;

import java.io.InputStream;
import java.text.ParseException;

/**
 * @author Lebedev Roman (lebedeffroman@gmail.com)
 * @version 1.0
 */
public class Parser {
    private LexicalAnalyzer lex;

    private Tree E() throws ParseException {
        switch (lex.curToken()) {
            case NOT:
            case VAR:
            case LPAREN:
                Tree term = T();
                Tree cont = Ed();
                return new Tree("E", term, cont);
            default:
                throw new AssertionError();
        }
    }

    private Tree Ed() throws ParseException {
        switch (lex.curToken()) {
            case OR:
            case XOR:
                Tree p = P();
                Tree cont = Ed();
                return new Tree("E'", p, cont);
            case END:
            case RPAREN:
                return new Tree(String.format("E'(%s)", lex.getEps()));
            default:
                throw new AssertionError();
        }
    }

    private Tree P() throws ParseException {
        switch (lex.curToken()) {
            case OR:
                Tree contO = O();
                return new Tree("P", contO);
            case XOR:
                Tree contX = X();
                return new Tree("P", contX);
            default:
                throw new AssertionError();
        }
    }

    private Tree O() throws ParseException {
        switch (lex.curToken()) {
            case OR:
                // skip or
                lex.nextToken();
                Tree term = T();
                return new Tree("O", new Tree("or"), term);
            default:
                throw new AssertionError();
        }
    }

    private Tree X() throws ParseException {
        switch (lex.curToken()) {
            case XOR:
                // skip xor
                lex.nextToken();
                Tree term = T();
                return new Tree("X", new Tree("xor"), term);
            default:
                throw new AssertionError();
        }
    }

    private Tree T() throws ParseException {
        switch (lex.curToken()) {
            case NOT:
            case VAR:
            case LPAREN:
                Tree neg = N();
                Tree cont = Td();
                return new Tree("T", neg, cont);
            default:
                throw new AssertionError();
        }
    }

    private Tree Td() throws ParseException {
        switch (lex.curToken()) {
            case AND:
                // skip and
                lex.nextToken();
                Tree neg = N();
                Tree cont = Td();
                return new Tree("T'", new Tree("and"), neg, cont);
            case OR:
            case XOR:
            case END:
            case RPAREN:
                return new Tree(String.format("T'(%s)", lex.getEps()));
            default:
                throw new AssertionError();
        }
    }

    private Tree N() throws ParseException {
        switch (lex.curToken()) {
            case NOT:
                // skip not
                lex.nextToken();
                Tree n = N();
                return new Tree("N", new Tree("not"), n);
            case LPAREN:
            case VAR:
                Tree var = V();
                return new Tree("N", var);
            default:
                throw new AssertionError();
        }
    }


    private Tree V() throws ParseException {
        switch (lex.curToken()) {
            case VAR:
                String name = lex.curTokenName();
                // skip variable name
                lex.nextToken();
                return new Tree(String.format("V(%s)", name));
            case LPAREN:
                // skip (
                lex.nextToken();
                Tree expr = E();
                if (lex.curToken() != Token.RPAREN) {
                    throw new ParseException(") expected at position ", lex.curPos());
                }
                // skip )
                lex.nextToken();
                return new Tree("V", new Tree("("), expr, new Tree(")"));
            default:
                throw new AssertionError();
        }
    }


    Tree parse(InputStream io) throws ParseException {
        lex = new LexicalAnalyzer(io);
        lex.nextToken();
        return E();
    }
}
