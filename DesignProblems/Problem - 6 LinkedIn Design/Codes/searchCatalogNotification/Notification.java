package searchCatalogNotification;

import java.util.Date;
import models.Account;

public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public abstract boolean sendNotification(Account account);

    public int getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}