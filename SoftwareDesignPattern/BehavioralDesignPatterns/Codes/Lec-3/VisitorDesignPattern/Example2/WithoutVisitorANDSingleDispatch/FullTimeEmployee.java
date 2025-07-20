// Full-time Employee
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateTax() {
        return salary * 0.25; // Fixed 25% tax
    }
}