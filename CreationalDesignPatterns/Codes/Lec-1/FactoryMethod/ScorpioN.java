import Models.ScopioNEngine;
import Models.ScorpioNBodyShell;

public class ScorpioN extends Scorpio {
    @Override
    public void makeScorpio() {
        System.out.println("ScorpioN class me hu");
        this.engine = new ScopioNEngine();
        this.bodyShell = new ScorpioNBodyShell();
    }

    @Override
    public void driveCar() {
        makeScorpio();
        System.out.println("I am driving a ScorpioN");
    }
}
