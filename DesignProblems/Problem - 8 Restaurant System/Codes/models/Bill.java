package models;

public class Bill {
    private int billId;
    private float amount;
    private float tax;
    private float tip;
    private boolean isPaid;

    public boolean generateBill() {
        return true;
    }
    public boolean updateBill() {
        return true;
    }

    public int getBillId() {
        return this.billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getTax() {
        return this.tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTip() {
        return this.tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public boolean isIsPaid() {
        return this.isPaid;
    }

    public boolean getIsPaid() {
        return this.isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}