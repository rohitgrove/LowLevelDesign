public class BulletProff implements IScorpioDecorator {
    ICar scorpio;
    public BulletProff(ICar meriScorpio) {
        this.scorpio = meriScorpio;
    }

    @Override
    public void start() {
        scorpio.start();
    }

    @Override
    public void stop() {
        scorpio.stop();
    }

    @Override
    public float getWeight() {
        return 300f + scorpio.getWeight();
    }
}
