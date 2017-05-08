package lab2;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lebedev Roman (lebedeffroman@gmail.com)
 * @version 1.0
 */
public class LexicalAnalyzer {
    private InputStream is;
    // Указывает на первый необработанный символ
    private int curChar;
    private int curPos;
    private Token curToken;
    private String curTokenName = "undefined";

    private static final Map<Token, String> names;

    static {
        names = new HashMap<>();
        names.put(Token.OR, "or");
        names.put(Token.XOR, "xor");
        names.put(Token.AND, "and");
        names.put(Token.NOT, "not");
        names.put(Token.LPAREN, "(");
        names.put(Token.RPAREN, ")");
        names.put(Token.END, "$");
        names.put(Token.EPS, "ε");
    }


    public LexicalAnalyzer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    private boolean isBlank(int c) {
        return c == ' ' || c == '\n' || c == '\t' || c == '\r';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }

        switch (curChar) {
            case 'n':
                getVariableEitherOp("not", Token.NOT);
                break;
            case 'a':
                getVariableEitherOp("and", Token.AND);
                break;
            case 'o':
                getVariableEitherOp("or", Token.OR);
                break;
            case 'x':
                getVariableEitherOp("xor", Token.XOR);
                break;
            case '(':
                curToken = Token.LPAREN;
                nextChar();
                break;
            case ')':
                curToken = Token.RPAREN;
                nextChar();
                break;
            case '$':
//            case -1:
                curToken = Token.END;
                break;
            default:
                if ((int) 'a' <= curChar && curChar <= (int) 'z' ||
                        (int) 'A' <= curChar && curChar <= (int) 'Z') {
                    curToken = Token.VAR;
                    curTokenName = String.valueOf((char) curChar);
                    nextChar();
                } else {
                    throw new ParseException("Illegal character " + curChar, curPos);
                }
        }
        if (curToken != Token.VAR) {
            curTokenName = names.get(curToken);
        }
    }

    private void getVariableEitherOp(String opName, Token token) throws ParseException {
        // Probably, it is variable name.
        curTokenName = String.valueOf((char) curChar);
        nextChar();
        if (isBlank(curChar) || curChar == '(' || curChar == ')' || curChar == '$') {
            curToken = Token.VAR;
            return;
        }

        for (int i = 1; i < opName.length(); i++) {
            if (curChar != opName.charAt(i)) {
                throw new ParseException("Illegal character " + curChar, curPos);
            }
            nextChar();
        }
        curToken = token;
    }

    public Token curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos;
    }

    public String curTokenName() {
        return curTokenName;
    }

    public String getEps() {
        return names.get(Token.EPS);
    }
}
