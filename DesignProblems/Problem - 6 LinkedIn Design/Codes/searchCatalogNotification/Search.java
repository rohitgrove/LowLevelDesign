package searchCatalogNotification;

import java.util.List;

public abstract class Search {
    public abstract List<User> searchUser(String name);

    public abstract List<CompanyPage> searchCompany(String name);

    public abstract List<Group> searchGroup(String name);

    public abstract List<Job> searchJob(String title);
}
