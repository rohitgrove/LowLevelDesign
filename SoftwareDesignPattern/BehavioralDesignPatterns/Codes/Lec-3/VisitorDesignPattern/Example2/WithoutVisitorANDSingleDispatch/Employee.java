// Base Employee class
public abstract class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateTax(); // Hardcoded tax logic in the class itself
}
