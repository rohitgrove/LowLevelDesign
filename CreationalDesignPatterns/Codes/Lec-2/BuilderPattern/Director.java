public class Director {
    ICarBuilder carBuilder;

    public Director(ICarBuilder builder) {
        this.carBuilder = builder;
    }

    // instructor
    public void constructor(boolean tyreNeeded, boolean engineNeeded, boolean bodyNeeded) {
        if (engineNeeded) {
            carBuilder.buildEngine();
        }
        if (tyreNeeded) {
            carBuilder.buildTyre();
        }
        carBuilder.buildChassis();
        if (bodyNeeded) {
            carBuilder.buildBodyShell();
        }
    }
}
