package person;

import professionalComponents.CompanyPage;
import professionalComponents.Group;

public abstract class Admin extends Person {
    public abstract boolean blockUser(User user);

    public abstract boolean unblockUser(User user);

    public abstract boolean disablePage(CompanyPage page);

    public abstract boolean enablePage(CompanyPage page);

    public abstract boolean deleteGroup(Group group);
}
