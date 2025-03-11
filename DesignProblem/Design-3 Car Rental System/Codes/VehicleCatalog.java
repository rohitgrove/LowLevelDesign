import java.util.List;
import java.util.Map;

public class VehicleCatalog implements Search {
    private Map<String, List<Vehicle>> vehicleTypes;
    private Map<String, List<Vehicle>> vehicleModels;

    // to return all vehicles of the given type.
    @Override
    public List<Vehicle> searchByType(String type) {
        // functionality
        return null;
    }

    // to return all vehicles of the given model.
    @Override
    public List<Vehicle> searchByModel(String model) {
        // functionality
        return null;
    }
}