public class ScorpioN extends AbstractScorpio {
    public ScorpioN(AbstractScorpioImpl scorpioImpl) {
        super(scorpioImpl);
    }

    @Override
    public void printSafetyReq() {
        scorpioImpl.printSafetyReq();
    }

    @Override
    public boolean isRightHanded() {
        return scorpioImpl.isRightHanded();
    }
}
