// Step 3: Client Code
public class Main {
    public static void main(String[] args) {
        SupportHandler customerSupport = new CustomerSupport();
        SupportHandler supervisor = new Supervisor();
        SupportHandler manager = new Manager();

        // Form the chain
        customerSupport.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        // Send requests
        customerSupport.handleRequest("Basic");
        customerSupport.handleRequest("Intermediate");
        customerSupport.handleRequest("Critical");
    }
}