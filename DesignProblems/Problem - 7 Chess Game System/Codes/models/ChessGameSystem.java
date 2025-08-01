package models;

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
    public List<ChessGameView> getActiveGames() {
        return this.activeGames;
    }

    public void setActiveGames(List<ChessGameView> activeGames) {
        this.activeGames = activeGames;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Admin> getAdmins() {
        return this.admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    private void createGame() {

    }

    private void JoinGame() {

    }

    // TODO: create more methods that delegate requests to their specific classes
    // TODO: complete the signature for the above 2 methods
}
