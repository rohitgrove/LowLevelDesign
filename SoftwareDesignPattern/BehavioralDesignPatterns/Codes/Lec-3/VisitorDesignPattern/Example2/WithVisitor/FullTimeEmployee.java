// Step 4: Concrete Elements
public class FullTimeEmployee implements Employee {
    String name;
    double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
