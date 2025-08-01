package searchCatalogNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import person.User;
import professionalComponents.CompanyPage;
import professionalComponents.Job;

public abstract class SearchCatalog {
    private HashMap<String, List<User>> users;
    private HashMap<String, List<CompanyPage>> companies;
    private HashMap<String, List<Job>> jobs;
    private HashMap<String, List<Group>> groups;

    public abstract void addNewUser(User user);

    public abstract void addNewCompany(CompanyPage company);

    public abstract void addNewGroup(Group group);

    public abstract void addNewJob(Job job);

    public List<User> searchUser(String name) {
        // functionality
        return new ArrayList<>();
    }

    public List<CompanyPage> searchCompany(String name) {
        // functionality
        return new ArrayList<>();
    }

    public List<Group> searchGroup(String name) {
        // functionality
        return new ArrayList<>();
    }

    public List<Job> searchJob(String title) {
        // functionality
        return new ArrayList<>();
    }
}
