// Higher level app now depends upon Abstraction
public class Application {
    private ILogger logger;

    public Application(ILogger logger) {
        this.logger = logger;
    }

    public void process() {
        logger.log("Application started");
        // Additional logic here
    }
}