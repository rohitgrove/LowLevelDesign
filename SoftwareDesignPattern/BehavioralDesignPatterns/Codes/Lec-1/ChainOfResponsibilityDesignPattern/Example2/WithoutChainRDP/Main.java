public class Main {
    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.handleRequest("Intermediate");
        helpDesk.handleRequest("Critical");
    }
}
