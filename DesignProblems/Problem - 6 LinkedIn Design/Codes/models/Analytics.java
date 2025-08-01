package models;

public class Analytics {
    private int searchAppearances;
    private int profileViews;
    private int postImpressions;
    private int totalConnections;

    public int getSearchAppearances() {
        return this.searchAppearances;
    }

    public void setSearchAppearances(int searchAppearances) {
        this.searchAppearances = searchAppearances;
    }

    public int getProfileViews() {
        return this.profileViews;
    }

    public void setProfileViews(int profileViews) {
        this.profileViews = profileViews;
    }

    public int getPostImpressions() {
        return this.postImpressions;
    }

    public void setPostImpressions(int postImpressions) {
        this.postImpressions = postImpressions;
    }

    public int getTotalConnections() {
        return this.totalConnections;
    }

    public void setTotalConnections(int totalConnections) {
        this.totalConnections = totalConnections;
    }
}