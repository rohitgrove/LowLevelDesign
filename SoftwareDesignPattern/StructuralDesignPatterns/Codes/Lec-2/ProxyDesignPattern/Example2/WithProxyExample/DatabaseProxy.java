// Step 3: Proxy
public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean isAuthorized = false;

    public DatabaseProxy(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void connect() {
        if (isAuthorized) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase();
            }
            realDatabase.connect();
        } else {
            System.out.println("Access Denied: You are not authorized to connect to the database.");
        }
    }

    @Override
    public void fetchData() {
        if (isAuthorized) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase();
            }
            realDatabase.fetchData();
        } else {
            System.out.println("Access Denied: You are not authorized to fetch data.");
        }
    }
}