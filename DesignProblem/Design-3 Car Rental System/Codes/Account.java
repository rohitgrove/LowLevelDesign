import Constants.AccountStatus;
import DataType.Person;

abstract class Account extends Person {
    private String accountId;
    private String password;
    private AccountStatus status;
    private VehicleReservation v;

    public abstract boolean resetPassword();
}