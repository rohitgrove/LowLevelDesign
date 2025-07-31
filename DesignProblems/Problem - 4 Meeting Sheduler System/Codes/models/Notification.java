package models;

import java.util.Date;

public class Notification {
    private int id;
    private String notificationContent;
    private Date creationTime;

    public void sendInviteNotification() {
    }

    public void sendCancelNotification() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotificationContent() {
        return this.notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}