import contants.Address;
import contants.JobStatus;

public class Job {
    private int jobId;
    private String jobTitle;
    private long dateOfPosting; // Using long instead of time_t for timestamp
    private String description;
    private CompanyPage company;
    private String employmentType;
    private Address location;
    private JobStatus status;
}