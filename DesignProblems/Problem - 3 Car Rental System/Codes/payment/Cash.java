package payment;

public class Cash extends Payment {
    @Override
    public boolean makePayment() {
        return true;
    }
}