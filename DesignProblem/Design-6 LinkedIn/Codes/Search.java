import java.util.List;

public interface Search {
    List<User> searchUser(String name);
    List<CompanyPage> searchCompany(String name);
    List<Group> searchGroup(String name);
    List<Job> searchJob(String title);
}
