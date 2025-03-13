package Models;

public class Queen extends Piece {
    @Override
    public boolean canMove(ChessBoard board, Box start, Box end) {
        return false;
    }
}
