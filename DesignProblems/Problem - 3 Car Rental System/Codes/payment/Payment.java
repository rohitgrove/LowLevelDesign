package payment;

import java.sql.Date;

import constants.PaymentStatus;

public abstract class Payment {
    protected double amount;
    protected Date timestamp;
    protected PaymentStatus status;

    public abstract boolean makePayment();
}
