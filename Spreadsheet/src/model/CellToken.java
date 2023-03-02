package model.Spreadsheet.src.model;

public class CellToken extends Token {
    private int myColumn;   // column A = 0, B = 1, ...
    private int myRow;

    public CellToken(final int theColumn, final int theRow) {
        myColumn = theColumn;
        myRow = theRow;
    }
}
