package models;

public class Cash extends Payment {
    private float cashPaid;

    @Override
    public void startTransaction() {

    }

    public float getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(float cashPaid) {
        this.cashPaid = cashPaid;
    }
}
