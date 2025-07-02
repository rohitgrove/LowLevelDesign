public class FlyingBird implements Bird {
    @Override
    public void eat() {
        System.out.println("Flying Bird is eating");
    }

    public void fly() {
        System.out.println("Flying Bird is flying");
    }
}
