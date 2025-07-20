// Todo 1: New Shape: Circle
public class Circle implements Shape {
    @Override
    public void accept(DrawingVisitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}