import java.util.List;
import java.util.ArrayList;

public class Message {
    private int messageId;
    private User sender;
    private List<User> recipients = new ArrayList<>();
    private String text;
    private byte[] media; // Using byte[] instead of vector<signed char>
    
    public boolean addRecipients(List<User> recipients) {
        // Implementation
        return false;
    }
}
