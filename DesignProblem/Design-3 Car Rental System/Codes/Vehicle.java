import Constants.VehicleStatus;
import java.util.Date;
import java.util.List;

public class Vehicle {
    private String vehicleId;
    private String licenseNumber;
    private int passengerCapacity;
    private boolean hasSunroof;
    private VehicleStatus status;
    private String model;
    private int manufacturingYear;
    private int mileage;
    private List<VehicleLog> log;
    private Date dueDate;
    private int price;

    public boolean reserveVehicle() {
        return false;
    }
    
    public boolean returnVehicle() {
        return false;
    }
    
    public float getPrice() {
        return 0.0f;
    }
    
    public void getServiceDone() {
    }
    
    // Added for the decorator pattern
    public void setPrice(float price) {
        this.price = (int)price;
    }
}
