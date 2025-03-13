package Models;

public class Move {
    private Box startBox;
    private Box endBox;
    private Piece pieceToBeMoved;
    private Piece pieceKilled;
    private Player player;

    public Move(Box start, Box end, Piece pieceToMove, Player player) {
        this.startBox = start;
        this.endBox = end;
        this.pieceToBeMoved = pieceToMove;
        this.player = player;
    }

    public Box getStartBox() {
        return startBox;
    }

    public void setStartBox(Box startBox) {
        this.startBox = startBox;
    }

    public Box getEndBox() {
        return endBox;
    }

    public void setEndBox(Box endBox) {
        this.endBox = endBox;
    }

    public Piece getPieceToBeMoved() {
        return pieceToBeMoved;
    }

    public void setPieceToBeMoved(Piece pieceToBeMoved) {
        this.pieceToBeMoved = pieceToBeMoved;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
