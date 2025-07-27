package Interface;

public abstract class Vehicle {
    private int licenseNo;

    public abstract void getTicket();

    public int getLicenseNo() {
        return this.licenseNo;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }
}