import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    private String name;
    private List<CarRentalSystem> branches = new ArrayList<>();
    // The CarRentalSystem is a singleton class that ensures it will have only one active instance at a time
    static CarRentalSystem system = null;

    
    public void addNewBranch(CarRentalBranch branch) {}

    // Created a static method to access the singleton instance of CarRentalSystem
    public static CarRentalSystem getInstance()
    {
        if (system == null)
        {
            system = new CarRentalSystem();
        }
        return system;
    }
}