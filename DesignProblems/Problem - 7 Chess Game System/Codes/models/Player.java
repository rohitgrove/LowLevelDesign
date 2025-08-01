package models;

public class Player extends Account {
    private Person person;
    private boolean whiteSide = false;
    private int rank;
    private int totalGamesPlayed;

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isWhiteSide() {
        return this.whiteSide;
    }

    public boolean getWhiteSide() {
        return this.whiteSide;
    }

    public void setWhiteSide(boolean whiteSide) {
        this.whiteSide = whiteSide;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getTotalGamesPlayed() {
        return this.totalGamesPlayed;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }
}