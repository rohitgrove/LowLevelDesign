import Models.ScoripioClassicBodyShell;
import Models.ScorpioClassicEngine;

public class ScorpioClassic extends Scorpio {
    @Override
    public void makeScorpio() {
        System.out.println("ScorpioClassic class main hu");
        this.engine = new ScorpioClassicEngine();
        this.bodyShell = new ScoripioClassicBodyShell();
    }

    @Override
    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving a ScorpioClassic");
    }
}
