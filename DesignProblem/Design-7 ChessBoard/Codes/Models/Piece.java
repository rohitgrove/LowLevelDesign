package Models;

public abstract class Piece {
    private boolean colorOfPiece;
    private boolean pieceKilled;

    public abstract boolean canMove(ChessBoard board, Box start, Box end);

    public boolean isColorOfPiece() {
        return colorOfPiece;
    }

    public void setColorOfPiece(boolean colorOfPiece) {
        this.colorOfPiece = colorOfPiece;
    }

    public boolean isPieceKilled() {
        return pieceKilled;
    }

    public void setPieceKilled(boolean pieceKilled) {
        this.pieceKilled = pieceKilled;
    }
}
