package Models;

import java.util.List;

public class ChessGameSystem {
    private List<ChessGameView> activeGames;
    private List<Player> players;
    private List<Admin> admins;
    private static ChessGameSystem systemInstance = null;

    private ChessGameSystem() {
    }

    public static ChessGameSystem getInstance() {
        if (systemInstance == null) {
            systemInstance = new ChessGameSystem();
        }
        return systemInstance;
    }

    // methods

    private void createGame() {

    }

    private void JoinGame() {

    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<ChessGameView> getActiveGames() {
        return activeGames;
    }

    public void setActiveGames(List<ChessGameView> activeGames) {
        this.activeGames = activeGames;
    }
}
