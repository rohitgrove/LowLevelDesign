package contants;

public class Address {
    private int zipCode;
    private String streetAddress;
    private String city;
    private String state;
    private String country;

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity(String city) {
        return this.city;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState(String state) {
        return this.state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry(String country) {
        return this.country;
    }
}
