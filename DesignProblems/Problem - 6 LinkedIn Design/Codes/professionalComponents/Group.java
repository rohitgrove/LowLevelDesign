package professionalComponents;

import java.util.List;
import models.Observer;
import models.Subject;

public abstract class Group extends Subject {
    private int groupId;
    private String name;
    private String description;
    private int totalMembers;
    private List<Observer> members;

    public abstract boolean updateDescription();

    @Override
    public void attach(Observer observer) {
        members.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // erase the entry of observer from members vector
    }

    @Override
    public void notification() {
        // loop over members
        for (Observer observer : members) {
            // observer.update("Hey new post in the group");
        }
    }
};