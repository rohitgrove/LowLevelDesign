public class RCScorpio implements ICar {
    @Override
    public void turnLeft() {
        System.out.println("I am inside turnLeft in Scorpio class");
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turnRight in Scorpio class");
    }

    @Override
    public void goStraight() {
        System.out.println("I am inside go striaght in Scorpio class");
    }
}
