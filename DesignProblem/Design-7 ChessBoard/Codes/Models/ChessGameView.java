package Models;

import constants.GameStatus;
import java.util.List;

public class ChessGameView {
    private Player player1;
    private Player player2;
    private ChessBoard board;
    private boolean currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    public boolean isOver() {
        // dummmy
        return false;
    }

    public boolean createMove(Player player, Box start, Box end) {
        // creation of Move
        // delegating play request to playMove
        // playMove() -> we will not directly call this
        // we will use a command for better encapsulation

        // dummy
        // return true;
        Piece piece = start.getPiece();

        Move newMove = new Move(start, end, piece, player);
        MoveCommand moveCommand = new MoveCommand(this, newMove, player);
        moveCommand.execute();
        // assuming -> everything works correctly
        return true;
    }

    private boolean playMove(Move move, Player player) {
        // validation of Move
        // if valid move, then update the board and proceed
        // stoire the move in movesPlayed

        // dummy
        return true;
    }

    public class MoveCommand implements ChessCommand {
        private ChessGameView game;
        private Move move;
        private Player player;
    
        public MoveCommand(ChessGameView view, Move move, Player player) {
            this.game = view;
            this.move = move;
            this.player = player;
        }
    
        @Override
        public void execute() {
            game.playMove(this.move, this.player);
        }
    
        public ChessGameView getGame() {
            return game;
        }
    
        public void setGame(ChessGameView game) {
            this.game = game;
        }
    
        public Move getMove() {
            return move;
        }
    
        public void setMove(Move move) {
            this.move = move;
        }
    
        public Player getPlayer() {
            return player;
        }
    
        public void setPlayer(Player player) {
            this.player = player;
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public ChessBoard getBoard() {
        return board;
    }

    public void setBoard(ChessBoard board) {
        this.board = board;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public boolean isCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(boolean currentTurn) {
        this.currentTurn = currentTurn;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public List<Move> getMovesPlayed() {
        return movesPlayed;
    }

    public void setMovesPlayed(List<Move> movesPlayed) {
        this.movesPlayed = movesPlayed;
    }
}
