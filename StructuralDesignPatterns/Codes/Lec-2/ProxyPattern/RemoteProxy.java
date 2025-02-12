public class RemoteProxy implements ICar {
    private RCScorpio scorpio = new RCScorpio();
    @Override
    public void turnLeft() {
        System.out.println("I am inside turnLeft in Proxy Class");
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turnRight in Proxy Class");
        scorpio.turnRight();
    }

    @Override
    public void goStraight() {
        System.out.println("I am inside go straight in Proxy Class");
        scorpio.goStraight();
    }
}
