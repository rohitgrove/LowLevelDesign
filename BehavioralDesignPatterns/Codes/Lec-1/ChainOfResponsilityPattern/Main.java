public class Main {
    public static void main(String[] args) {
        // sabse phele chain create kardo

        AbstractHandler pressureHandler = new PresserIssueHandler(null);
        EngineIssueHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);

        // request reddy karo
        PressureIssueRequest pressureIssueRequest = new PressureIssueRequest();
        engineIssueHandler.handleRequest(pressureIssueRequest);
    }
}