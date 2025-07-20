// Todo: New Concrete Visitor for Bonus Calculation
public class BonusVisitor implements Visitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println(employee.name + " Bonus: " + (employee.salary * 0.10));
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println(employee.name + " Bonus: " + (employee.salary * 0.05));
    }
}
