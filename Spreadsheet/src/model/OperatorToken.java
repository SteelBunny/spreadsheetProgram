package model.Spreadsheet.src.model;

public class OperatorToken extends Token {
    public static final char Plus = '+';
    public static final char Minus = '-';
    public static final char Mult = '*';
    public static final char Div = '/';
    public static final char LeftParen = '(';
    private char myOperator;

    public OperatorToken(final char theOperator) {
        myOperator = theOperator;
    }
}

