package models;

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
        return this.startBox;
    }

    public void setStartBox(Box startBox) {
        this.startBox = startBox;
    }

    public Box getEndBox() {
        return this.endBox;
    }

    public void setEndBox(Box endBox) {
        this.endBox = endBox;
    }

    public Piece getPieceToBeMoved() {
        return this.pieceToBeMoved;
    }

    public void setPieceToBeMoved(Piece pieceToBeMoved) {
        this.pieceToBeMoved = pieceToBeMoved;
    }

    public Piece getPieceKilled() {
        return this.pieceKilled;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}