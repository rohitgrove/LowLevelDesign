public class Child implements Human {
    @Override
    public void eat() {
        System.out.println("Child is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Child is Sleeping");
    }

    public void childishBehaviour() {
        System.out.println("child showing ChildishBehaviour");
    }
}
