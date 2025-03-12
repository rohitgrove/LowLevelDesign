import java.util.List;
import java.util.ArrayList;

public class Post {
    private int postId;
    private User postOwner;
    private String text;
    private byte[] media; // Using byte[] instead of vector<signed char>
    private int totalReacts;
    private int totalShares;
    private List<Comment> comments = new ArrayList<>();
    
    public boolean updateText() {
        // Implementation
        return false;
    }
}