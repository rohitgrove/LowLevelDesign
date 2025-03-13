package Models;

public class Box {
    private Piece piece;
    private int rowIndex;
    private int colIndex;

    public Piece getPiece() {
        return this.piece;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }
}
