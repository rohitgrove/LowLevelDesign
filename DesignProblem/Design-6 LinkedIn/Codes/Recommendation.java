public class Recommendation {
    private int userId;
    private long createdOn; // Using long instead of time_t for timestamp
    private String description;
    private boolean isAccepted;
}
