public class Supervisor extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Intermediate")) {
            System.out.println("Supervisor: Handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}