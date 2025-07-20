// Part-time Employee
public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateTax() {
        return salary * 0.15; // Fixed 15% tax
    }
}
