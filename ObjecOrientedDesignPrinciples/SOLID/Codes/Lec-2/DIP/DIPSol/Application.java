// SOLUTION
// Make an Abstration, and make both dependent on ABS.

// 1. Define the Abstraction
interface ILogger {
    void log(String message);
}

// 2. Implement the Abstraction
class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}

class FileLogger implements ILogger {
    @Override
    public void log(String message) {
        // Code to write the message to a file
    }
}

// 3. Extend Functionality, if needed? which principle?
class ExternalServiceLogger implements ILogger {
    @Override
    public void log(String message) {
        // Code to send the message to an external service
        // This could involve HTTP requests, dealing with authentication, etc.
    }
}

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