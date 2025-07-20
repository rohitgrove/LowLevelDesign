// Step 4: Concrete Visitor
public class SoundVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Dog barks"); // Second Dispatch
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat meows"); // Second Dispatch
    }
}