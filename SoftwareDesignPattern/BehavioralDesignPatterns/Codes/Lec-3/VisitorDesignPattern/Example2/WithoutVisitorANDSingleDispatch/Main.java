// Client Code
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Rahul", 50000);
        Employee emp2 = new PartTimeEmployee("Amit", 50000);

        System.out.println(emp1.name + " Tax: " + emp1.calculateTax()); // Rahul Tax: 12500.0
        System.out.println(emp2.name + " Tax: " + emp2.calculateTax()); // Amit Tax: 7500.0
    }
}