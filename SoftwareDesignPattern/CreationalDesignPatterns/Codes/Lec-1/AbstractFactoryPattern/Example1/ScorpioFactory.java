import Models.IEngine;
import Models.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory {
    @Override
    public IEngine createEngine() {
        System.out.println("Scorpio ka engine bana rha hu");
        return new ScorpioEngine();
    }
}
