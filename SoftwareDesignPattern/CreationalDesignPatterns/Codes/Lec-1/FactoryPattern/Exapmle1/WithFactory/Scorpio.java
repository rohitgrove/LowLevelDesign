import Models.IBodyShell;
import Models.IEngine;
import Models.ScorpioBodyShell;
import Models.ScorpioEngine;

public class Scorpio {
    IEngine engine;
    IBodyShell bodyShell;

    public void makeScorpio() {
        System.out.println("Scorpio class main hu");
        this.engine = new ScorpioEngine();
        this.bodyShell = new ScorpioBodyShell();
    }

    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving a Scorpio");
    }
}
