import Models.Fortuner;
import Models.ICar;

public class FortunerBuilder implements ICarBuilder {
    Fortuner s1;
    @Override
    public void buildEngine() {
        System.out.println("Fortuner Engine getting inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner Chassis getting inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner Tyre getting inserted");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner BodyShell getting inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Fortuner tyaar h, le jao");
        return s1;
    }
}