// Step 2: Concrete Elements (Shapes)
public class Square implements Shape {
    @Override
    public void accept(DrawingVisitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}