public class Scorpio implements ICar {
    @Override
    public void start() {
        System.out.println("Scorpio is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Scorpio is Stoping");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
