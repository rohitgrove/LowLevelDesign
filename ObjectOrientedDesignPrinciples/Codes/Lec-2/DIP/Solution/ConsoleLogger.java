// 2. Implement the Abstraction
class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}