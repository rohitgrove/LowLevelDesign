package models;

public abstract class Piece {
    private boolean colorOfPiece;
    private boolean pieceKilled;

    public abstract boolean canMove(ChessBoard board, Box start, Box end);

    public boolean isColorOfPiece() {
        return this.colorOfPiece;
    }

    public boolean getColorOfPiece() {
        return this.colorOfPiece;
    }

    public void setColorOfPiece(boolean colorOfPiece) {
        this.colorOfPiece = colorOfPiece;
    }

    public boolean isPieceKilled() {
        return this.pieceKilled;
    }

    public boolean getPieceKilled() {
        return this.pieceKilled;
    }

    public void setPieceKilled(boolean pieceKilled) {
        this.pieceKilled = pieceKilled;
    }
}