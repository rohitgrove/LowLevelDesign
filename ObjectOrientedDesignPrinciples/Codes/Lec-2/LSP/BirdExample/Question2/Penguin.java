// Subclass: Penguin
public class Penguin extends Bird {
    // Exception 1: Penguins cannot fly, so we don't override the fly method
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
