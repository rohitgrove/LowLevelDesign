public class AircraftOne {
    private static AircraftOne aircraftOneInstance = null;

    private AircraftOne() {
    }

    public static AircraftOne getInstance() {
        if (aircraftOneInstance == null) {
            aircraftOneInstance = new AircraftOne();
        }
        return aircraftOneInstance;
    }

    public static void main(String[] args) {
        AircraftOne a1 = AircraftOne.getInstance();
        AircraftOne a2 = AircraftOne.getInstance();
    }
}
