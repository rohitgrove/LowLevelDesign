public class ScorpioN extends AbstractScorpio {
    public ScorpioN(AbstractScorpioImpl scorpioImpl) {
        super(scorpioImpl);
    }

    @Override
    void printSafetyReq() {
        scorpioImpl.isRightHanded();
    }

    @Override
    boolean isRightHanded() {
        return scorpioImpl.isRightHanded();
    }
}