package payment;

public class CreditCard extends Payment {
    private String nameOnCard;
    private String cardNumber;
    private String billingAddress;
    private int code;

    @Override
    public boolean makePayment() {
        return true;
    }
}
