public class Main {
    public static void main(String[] args) {
        // ExternalServiceLogger externalServiceLogger = new ExternalServiceLogger();
        Application app = new Application(new FileLogger());
        app.process();
    }
}
