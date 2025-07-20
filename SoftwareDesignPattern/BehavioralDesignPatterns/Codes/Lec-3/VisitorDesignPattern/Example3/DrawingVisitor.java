// Step 3: Visitor Interface
public interface DrawingVisitor {
    void visit(Square square);
    void visit(Rectangle rectangle);
    void visit(Circle circle); // Todo: Update Visitor Interface -> New Method for Circle
}
