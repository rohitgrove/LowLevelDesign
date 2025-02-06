import Models.DefenderEngine;
import Models.IEngine;

public class DefenderFactory implements IVehicleFactory {
    @Override
    public IEngine createEngine() {
        System.out.println("Defender ka engine bana raha hu");
        return new DefenderEngine();
    }
}
