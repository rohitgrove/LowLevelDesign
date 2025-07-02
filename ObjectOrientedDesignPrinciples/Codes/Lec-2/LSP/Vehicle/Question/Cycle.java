public class Cycle implements Vehicle {
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Cycle has no engine.");
    }
}
