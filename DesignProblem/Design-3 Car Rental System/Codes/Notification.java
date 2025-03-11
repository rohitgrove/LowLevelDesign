import java.util.Date;

public abstract class Notification {
    private int notificationId;
    // Java uses Date class to represent date and time
    private Date createdOn;
    private String content;

    public abstract void sendNotification(Account account);
}
