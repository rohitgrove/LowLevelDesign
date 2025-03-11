import java.util.List;

interface Search {
    public List<Vehicle> searchByType(String type);
    public List<Vehicle> searchByModel(String model);
}
