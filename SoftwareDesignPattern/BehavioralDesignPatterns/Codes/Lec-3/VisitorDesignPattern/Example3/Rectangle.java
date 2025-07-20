public class Rectangle implements Shape {
    @Override
    public void accept(DrawingVisitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}