import java.util.List;
import java.util.Date;

public class Customer extends Account {
    private String licenseNumber;
    private Date licenseExpiry;

    public boolean addReservation() {
        return false;
    }
    
    public boolean cancelReservation() {
        return false;
    }
    
    public List<VehicleReservation> getReservations() {
        return null;
    }
    
    public boolean resetPassword() {
        // definition
        return false;
    }
}