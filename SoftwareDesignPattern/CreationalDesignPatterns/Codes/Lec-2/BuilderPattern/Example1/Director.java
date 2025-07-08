public class Director {
    ICarBuilder carBuilder;

    public Director(ICarBuilder builder) {
        this.carBuilder = builder;
    }

    // instruction
    public void construct(boolean tyre, boolean engineNeeded, boolean bodyNeeded) {
        if (engineNeeded) {
            carBuilder.buildEngine();
        }
        if (tyre) {
            carBuilder.buildTyre();
        }
        if (bodyNeeded) {
            carBuilder.buildChassis();
        }
        carBuilder.buildBodyShell();
    }
}
