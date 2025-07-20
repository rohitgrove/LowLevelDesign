// Step 5: Client Code
public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle(); // Todo 4: New shape added
        DrawingVisitor visitor = new CanvasDrawingVisitor();

        square.accept(visitor); // First Dispatch (Square -> accept()), Second Dispatch (Visitor -> visit(Square))
        rectangle.accept(visitor);
        circle.accept(visitor); // Todo 4: Works without modifying old code
    }
}