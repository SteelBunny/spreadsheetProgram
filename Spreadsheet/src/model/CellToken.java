package model.Spreadsheet.src.model;

public class CellToken extends Token {
    private final int myColumn;   // column A = 0, B = 1, ...
    private final int myRow;

    public CellToken() {
        myColumn = 0;
        myRow = 0;
    }

    public int getRow() {
        return myRow;
    }

    public int getColumn() {
        return myColumn;
    }
}
