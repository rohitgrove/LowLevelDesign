import contants.ConnectionInviteStatus;

public class ConnectionInvitation {
    private User sender;
    private User recipient; // Changed from recipients to recipient as it's singular in C++
    private long dateCreated; // Using long instead of time_t for timestamp
    private ConnectionInviteStatus status;
    
    public boolean acceptConnection() {
        // Implementation
        return false;
    }
    
    public boolean rejectConnection() {
        // Implementation
        return false;
    }
}
