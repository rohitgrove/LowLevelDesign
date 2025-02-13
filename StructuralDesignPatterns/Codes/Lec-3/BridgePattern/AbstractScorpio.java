public abstract class AbstractScorpio {
    // BRIDGE
    AbstractScorpioImpl scorpioImpl;

    public AbstractScorpio(AbstractScorpioImpl sc) {
        scorpioImpl = sc;
    }

    abstract boolean isRightHanded();
    abstract void printSafetyReq();
}