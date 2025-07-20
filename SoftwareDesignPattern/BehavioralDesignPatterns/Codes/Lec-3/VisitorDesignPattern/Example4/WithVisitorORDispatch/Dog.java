// Step 2: Concrete Elements
public class Dog implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}