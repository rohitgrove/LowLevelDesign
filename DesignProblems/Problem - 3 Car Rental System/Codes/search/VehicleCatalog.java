package search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vehicle.Vehicle;

public class VehicleCatalog implements Search {
    private HashMap<String, List<Vehicle>> vehicleTypes;
    private HashMap<String, List<Vehicle>> vehicleModels;

    @Override
    public List<Vehicle> searchByType(String type) {
        return vehicleTypes.getOrDefault(type, new ArrayList<>());
    }

    @Override
    public List<Vehicle> searchByModel(String model) {
        return vehicleModels.getOrDefault(model, new ArrayList<>());
    }
}