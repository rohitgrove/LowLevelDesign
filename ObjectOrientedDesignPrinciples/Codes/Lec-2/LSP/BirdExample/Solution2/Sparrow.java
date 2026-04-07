// Subclass: Sparrow
public class Sparrow extends Bird implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}