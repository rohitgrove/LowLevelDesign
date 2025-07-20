// Step 1: Visitor Interface
public interface Visitor {
    public void visit(FullTimeEmployee employee);

    public void visit(PartTimeEmployee employee);
}