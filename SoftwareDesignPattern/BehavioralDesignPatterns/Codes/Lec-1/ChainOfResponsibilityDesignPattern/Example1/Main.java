public class Main {
    public static void main(String[] args) {
        // corPattern
        // sabse pehle chain create kardo

        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        EngineIssueHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);

        // request ready karo
        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();

        engineIssueHandler.handleRequest(pressureIssueRequest);
    }
}
