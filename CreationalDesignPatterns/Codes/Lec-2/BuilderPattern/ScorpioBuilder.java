import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder {
    Scorpio s1;
    @Override
    public void buildEngine() {
        System.out.println("Scorpio Engine getting inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio Chassis getting inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Scorpio Tyre getting inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Scorpio BodyShell getting inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio tyaar h, le jao");
        return s1;
    }
    
}