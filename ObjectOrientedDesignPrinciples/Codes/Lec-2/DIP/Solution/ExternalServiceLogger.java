// 3. Extend Functionality, if needed? which principle?
class ExternalServiceLogger implements ILogger {
    @Override
    public void log(String message) {
        // Code to send the message to an external service
        // This could involve HTTP requests, dealing with authentication, etc.
    }
}