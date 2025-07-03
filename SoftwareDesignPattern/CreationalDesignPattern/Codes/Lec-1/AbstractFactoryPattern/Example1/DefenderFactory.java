import Models.IEngine;
import Models.ScorpioEngine;

public class DefenderFactory implements  IVehicleFactory {
    @Override
    public IEngine createEngine() {
        System.out.println("Defender ka engine bana rha hu");
        return new ScorpioEngine();
    }
}
