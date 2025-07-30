package account;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Receptionist extends Account {
    private Date dateJoined;

    public List<Customer> searchCustomer(String name) {
        return new ArrayList<>();
    }

    public boolean addReservation() {
        return true;
    }

    public boolean cancelReservation() {
        return true;
    }

    @Override
    public boolean resetPassword() {
        return true;
    }
}
