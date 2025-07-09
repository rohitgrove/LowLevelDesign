// Step 2: Real Subject
public class RealDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from the database...");
    }
}