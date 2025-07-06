// Step 3: VintageCar Class
public class VintageCar extends Car {
    int model;
    CarEngine carEngine;

    public VintageCar() {
        super("BLUE", 4, 200);
        this.model = 2024;
        this.carEngine = new CarEngine();
    }

    private VintageCar(CarEngine carEngine, int model) {
        super("BLUE", 4, 200);
        this.model = model;
        this.carEngine = new CarEngine(carEngine);
    }

    @Override
    public VintageCar clone() {
        return new VintageCar(this.carEngine, this.model);
    }

    @Override
    public void setEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public void setModel(int model) {
        this.model = model;
    }
}
