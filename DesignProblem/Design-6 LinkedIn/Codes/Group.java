import java.util.ArrayList;
import java.util.List;

public class Group implements Subject {
    private int groupId;
    private String name;
    private String description;
    private int totalMembers;
    private List<Observer> members = new ArrayList<>();
    
    public boolean updateDescription() {
        // Implementation
        return false;
    }
    
    @Override
    public void attach(Observer observer) {
        members.add(observer);
    }
    
    @Override
    public void detach(Observer observer) {
        // Remove the observer from members list
        members.remove(observer);
    }
    
    @Override
    public void Notify() {
        // Loop over members
        for (Observer observer : members) {
            observer.update("Hey new post in the group");
        }
    }
}