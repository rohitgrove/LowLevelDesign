// Higher level module
public class Application {
    private FileLogger logger;

    public Application() {
        logger = new FileLogger();
    }

    public void process() {
        logger.log("Application started");
        // Additional logic here
    }
}