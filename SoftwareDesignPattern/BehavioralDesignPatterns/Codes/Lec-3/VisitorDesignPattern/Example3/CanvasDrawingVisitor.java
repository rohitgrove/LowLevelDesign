// Step 4: Concrete Visitor (Drawing Implementation)
public class CanvasDrawingVisitor implements DrawingVisitor {
    @Override
    public void visit(Square square) {
        System.out.println("Drawing a Square");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a Circle"); // Todo 3: Update Concrete Visitor -> Added new behavior without modifying old shapes
    }
}
