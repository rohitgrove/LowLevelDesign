import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class SearchCatalog implements Search {
    // In-Memory DB
    private Map<String, List<User>> users = new HashMap<>();
    private Map<String, List<CompanyPage>> companies = new HashMap<>();
    private Map<String, List<Job>> jobs = new HashMap<>();
    private Map<String, List<Group>> groups = new HashMap<>();
    
    public void addNewUser(User user) {
        // Implementation
    }
    
    public void addNewCompany(CompanyPage company) {
        // Implementation
    }
    
    public void addNewGroup(Group group) {
        // Implementation
    }
    
    public void addNewJob(Job job) {
        // Implementation
    }
    
    @Override
    public List<User> searchUser(String name) {
        // Implementation
        return new ArrayList<>();
    }
    
    @Override
    public List<CompanyPage> searchCompany(String name) {
        // Implementation
        return new ArrayList<>();
    }
    
    @Override
    public List<Group> searchGroup(String name) {
        // Implementation
        return new ArrayList<>();
    }
    
    @Override
    public List<Job> searchJob(String title) {
        // Implementation
        return new ArrayList<>();
    }
}
