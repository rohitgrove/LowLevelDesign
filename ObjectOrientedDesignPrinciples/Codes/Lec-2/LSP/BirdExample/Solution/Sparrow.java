public class Sparrow extends Bird implements IFlyingBird, ISingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow Eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow is Singing");
    }
}
