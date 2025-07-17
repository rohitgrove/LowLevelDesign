public class HelpDesk {
    public void handleRequest(String issue) {
        if (issue.equals("Basic")) {
            System.out.println("Handled by Customer Support.");
        } else if (issue.equals("Intermediate")) {
            System.out.println("Handled by Supervisor.");
        } else if (issue.equals("Critical")) {
            System.out.println("Handled by Manager.");
        } else {
            System.out.println("No one can handle this request.");
        }
    }
}