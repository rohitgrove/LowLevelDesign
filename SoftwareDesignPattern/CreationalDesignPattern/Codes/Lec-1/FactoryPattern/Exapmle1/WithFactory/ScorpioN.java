import Models.ScorpioNBodyShell;
import Models.ScorpioNEngine;

public class ScorpioN extends Scorpio {
    @Override
    public void makeScorpio() {
        System.out.println("ScorpioN class main hu");
        this.engine = new ScorpioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
    }

    @Override
    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving a ScorpioN");
    }
}
