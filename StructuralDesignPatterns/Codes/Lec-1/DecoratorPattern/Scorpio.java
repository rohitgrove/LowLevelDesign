public class Scorpio implements ICar {
    @Override
    public void start() {
        System.out.println("Scorpio is starting");
    }

    @Override
    public void stop() {
        System.out.println("Scorpio is stoping");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}