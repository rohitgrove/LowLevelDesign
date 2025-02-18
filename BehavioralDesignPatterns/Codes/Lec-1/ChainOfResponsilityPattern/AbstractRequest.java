public abstract class AbstractRequest {
    private int requestCode;

    public AbstractRequest(int reqCode) {
        this.requestCode = reqCode;
    }

    public int getRequestCode() {
        return this.requestCode;
    }
}
