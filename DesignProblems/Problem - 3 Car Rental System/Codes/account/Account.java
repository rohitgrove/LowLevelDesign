package account;

import constants.AccountStatus;
import datatypes.Person;
import logs.VehicleReservation;

public abstract class Account extends Person {
    protected String accountId;
    protected String password;
    protected AccountStatus status;
    protected VehicleReservation v;

    public abstract boolean resetPassword();
}
