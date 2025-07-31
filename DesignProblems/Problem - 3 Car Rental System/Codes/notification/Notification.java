package notification;

import java.sql.Date;

import account.Account;

public abstract class Notification {
    protected int notificationId;
    protected Date createdOn;
    protected String content;

    public abstract void sendNotification(Account account);
}
