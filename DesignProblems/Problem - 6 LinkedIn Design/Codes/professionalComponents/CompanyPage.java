package professionalComponents;

import java.util.List;
import person.User;

public class CompanyPage {
    private int pageId;
    private String name;
    private String description;
    private String type;
    private int companySize;
    private User createdBy;
    private List<Job> jobs;

    public int getPageId() {
        return this.pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCompanySize() {
        return this.companySize;
    }

    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public List<Job> getJobs() {
        return this.jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}