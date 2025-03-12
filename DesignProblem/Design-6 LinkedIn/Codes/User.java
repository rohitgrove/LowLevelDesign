import java.util.List;
import java.util.ArrayList;

public class User extends Person implements Observer {
    private int userId;
    private long dateOfJoining; // Using long instead of time_t for timestamp
    private Profile profile;
    
    private List<User> followsUsers = new ArrayList<>(); // contain most recent 10 follows
    private List<CompanyPage> followCompanies = new ArrayList<>();
    private List<User> connections = new ArrayList<>();
    private List<Group> joinedGroups = new ArrayList<>();
    private List<CompanyPage> createdPages = new ArrayList<>();
    private List<Group> createdGroups = new ArrayList<>();
    
    public boolean sendMessage(Message message) {
        // Implementation
        return false;
    }
    
    public boolean sendInvite(ConnectionInvitation invite) {
        // Implementation
        return false;
    }
    
    public boolean cancelInvite(ConnectionInvitation invite) {
        // Implementation
        return false;
    }
    
    public boolean createPage(CompanyPage page) {
        // Implementation
        return false;
    }
    
    public boolean deletePage(CompanyPage page) {
        // Implementation
        return false;
    }
    
    public boolean createGroup(Group group) {
        // Implementation
        return false;
    }
    
    public boolean deleteGroup(Group group) {
        // Implementation
        return false;
    }
    
    public boolean createPost(Post post) {
        // Implementation
        return false;
    }
    
    public boolean deletePost(Post post) {
        // Implementation
        return false;
    }
    
    public boolean createComment(Comment comment) {
        // Implementation
        return false;
    }
    
    public boolean deleteComment(Comment comment) {
        // Implementation
        return false;
    }
    
    public boolean react(Post post) {
        // Implementation
        return false;
    }
    
    public boolean requestRecommendation(User user) {
        // Implementation
        return false;
    }
    
    public boolean acceptRecommendation(User user) {
        // Implementation
        return false;
    }
    
    public boolean applyForJob(Job job) {
        // Implementation
        return false;
    }
    
    @Override
    public void update(String message) {
        // Implementation to receive notifications
    }
}