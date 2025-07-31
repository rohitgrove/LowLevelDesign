package account;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import logs.VehicleReservation;

public class Customer extends Account {
    private String licenseNumber;
    private Date licenseExpiry;

    public boolean addReservation() {
        return true;
    }

    public boolean cancelReservation() {
        return true;
    }

    public List<VehicleReservation> getReservations() {
        return new ArrayList<>();
    }

    @Override
    public boolean resetPassword() {
        return true;
    }
}
