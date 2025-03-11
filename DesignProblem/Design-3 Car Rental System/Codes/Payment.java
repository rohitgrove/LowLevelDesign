import Constants.PaymentStatus;
import java.util.Date;

public abstract class Payment {
    // Data members
    private double amount;
    // Java uses Date class to represent date and time
    private Date timestamp;
    private PaymentStatus status;

    public abstract boolean makePayment();
}