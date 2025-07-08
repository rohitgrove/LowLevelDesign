// Step 3: RaceCar Class
public class RaceCar extends Car {
    int model;
    CarEngine carEngine;
    int speed;

    public RaceCar() {
        super("RED", 4, 100);
        this.model = 2020;
        this.carEngine = new CarEngine();
        this.speed = 200;
    }

    private RaceCar(CarEngine carEngine, int model) {
        super("RED", 4, 100);
        this.model = model;
        this.carEngine = new CarEngine(carEngine); // Deep Copy - Copy Construtor
    }

    @Override
    public RaceCar clone() {
        return new RaceCar(this.carEngine, this.model);
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