public abstract class AbstractScorpio {
    // BRIDGE
    AbstractScorpioImpl scorpioImpl;

    public AbstractScorpio(AbstractScorpioImpl sc) {
        this.scorpioImpl = sc;
    }

    public abstract boolean isRightHanded();

    public abstract void printSafetyReq();
}
