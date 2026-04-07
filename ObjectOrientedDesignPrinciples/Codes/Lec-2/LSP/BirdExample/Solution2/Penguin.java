// Subclass: Penguin
public class Penguin extends Bird implements ISwimmable {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}