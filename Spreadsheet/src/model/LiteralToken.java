package model.Spreadsheet.src.model;

public class LiteralToken extends Token {
    private int myLiteral;

    private LiteralToken(final int theLiteral) {
        myLiteral = theLiteral;
    }
}
