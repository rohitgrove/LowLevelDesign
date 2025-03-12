import contants.Address;

public class Experience {
    private String title;
    private String company;
    private Address location;
    private long startDate; // Using long instead of time_t for timestamp
    private long endDate; // Using long instead of time_t for timestamp
    private String description;
}
