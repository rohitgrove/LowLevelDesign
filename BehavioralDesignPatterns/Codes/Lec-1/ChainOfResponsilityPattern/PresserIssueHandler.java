public class PresserIssueHandler extends AbstractHandler {
    public static int code = 303;
    public PresserIssueHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (request.getRequestCode() == code) {
            System.out.println("PressureHandler is handling request");
        } else {
            super.handleRequest(request);
        }
    }
}