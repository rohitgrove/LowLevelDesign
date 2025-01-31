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

// Lower level module
class FileLogger {

    public void log(String message) {
        // Code to write the message to a file
    }
}
// in above example higher level module Application is coupled/dependent on
// lower level module,
// that's the violaton of DIP
