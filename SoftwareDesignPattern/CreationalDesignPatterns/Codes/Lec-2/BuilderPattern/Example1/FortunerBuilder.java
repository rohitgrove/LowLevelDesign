import Models.Fortuner;
import Models.ICar;

public class FortunerBuilder implements ICarBuilder {
    Fortuner s1;
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
        System.out.println("Scorpio Body getting inserted");
    }

    @Override
    public ICar Build() {
        System.out.println("Fortuner tyar hai, le jao");
        return s1;
    }
}
