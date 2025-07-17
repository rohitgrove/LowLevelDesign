public class Manager extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Critical")) {
            System.out.println("Manager: Handling the issue.");
        } else {
            System.out.println("No one can handle this request.");
        }
    }
}