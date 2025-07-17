// Step 2: Create Concrete Handlers
public class CustomerSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Basic")) {
            System.out.println("Customer Support: Handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}