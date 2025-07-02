public class Adult implements Human {
    @Override
    public void eat() {
        System.out.println("Adult is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Adult is Sleeping");
    }

    public void work() {
        System.out.println("Adult going office");
    }

    public void eatDinner() {
        System.out.println("Adult is eating dinner");
    }
}
