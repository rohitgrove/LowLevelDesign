package models;

public class Box {
    private Piece piece;
    private int rowIndex;
    private int colIndex;

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getRowIndex() {
        return this.rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return this.colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }
}