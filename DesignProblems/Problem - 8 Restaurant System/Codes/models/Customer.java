package models;

public class Customer extends Person {
    private String customerInfo;

    public String getCustomerInfo() {
        return this.customerInfo;
    }

    public void setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
    }
}