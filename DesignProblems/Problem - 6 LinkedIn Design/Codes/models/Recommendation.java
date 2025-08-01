package models;

import java.sql.Date;

public class Recommendation {
    private int userId;
    private Date createdOn;
    private String description;
    private boolean isAccepted;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsAccepted() {
        return this.isAccepted;
    }

    public boolean getIsAccepted() {
        return this.isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
}