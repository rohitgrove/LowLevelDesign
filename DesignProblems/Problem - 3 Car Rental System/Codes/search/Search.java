package search;

import java.util.*;

import vehicle.Vehicle;

public interface Search {
    List<Vehicle> searchByType(String type);
    List<Vehicle> searchByModel(String model);
}
