// Step 5: Client Code
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Visitor soundVisitor = new SoundVisitor();

        dog.accept(soundVisitor); // First dispatch (Dog -> accept()), Second dispatch (Visitor -> visit(Dog))
        cat.accept(soundVisitor); // First dispatch (Cat -> accept()), Second dispatch (Visitor -> visit(Cat))
    }
}
