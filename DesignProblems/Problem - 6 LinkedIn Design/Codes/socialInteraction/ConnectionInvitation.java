package socialInteraction;

import constants.ConnectionInviteStatus;
import java.util.Date;
import person.User;

public class ConnectionInvitation {
    private User sender;
    private User recipients;
    private Date dateCreated;
    private ConnectionInviteStatus status;

    public User getSender() {
        return this.sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipients() {
        return this.recipients;
    }

    public void setRecipients(User recipients) {
        this.recipients = recipients;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ConnectionInviteStatus getStatus() {
        return this.status;
    }

    public void setStatus(ConnectionInviteStatus status) {
        this.status = status;
    }
}