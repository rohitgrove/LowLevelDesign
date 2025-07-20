// Step 2: Concrete Visitor for Tax Calculation
public class TaxVisitor implements Visitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println(employee.name + " Tax: " + (employee.salary * 0.25));
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println(employee.name + " Tax: " + (employee.salary * 0.15));
    }
}