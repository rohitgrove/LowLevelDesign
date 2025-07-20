import java.util.ArrayList;
import java.util.List;

// Step 5: Client Code
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Rahul", 50000)); // Rahul Tax: 12500.0
        employees.add(new PartTimeEmployee("Amit", 50000)); // Amit Tax: 7500.0

        Visitor taxVisitor = new TaxVisitor();

        for (Employee emp : employees) {
            emp.accept(taxVisitor);
        }

        // Todo: New Bonus Calculation
        System.out.println("\nCalculating Bonuses:");
        Visitor bonusVisitor = new BonusVisitor();
        for (Employee emp : employees) {
            emp.accept(bonusVisitor);
        }
    }
}
/*
 * Final Output:
 * Rahul Tax: 12500.0
 * Amit Tax: 7500.0
 * 
 * Calculating Bonuses:
 * Rahul Bonus: 5000.0
 * Amit Bonus: 2500.0
 */