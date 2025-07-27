package models;

public class ParkingRate {
    private double hours;
    private double rate;

    public double calculateAmount() {
        // addd your impl here
        return 0;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
