import java.util.List;
import java.util.ArrayList;

public class Comment {
    private int commentId;
    private User commentOwner;
    private String text;
    private int totalReacts;
    private List<Comment> comments = new ArrayList<>();
    
    public boolean updateText() {
        // Implementation
        return false;
    }
}
