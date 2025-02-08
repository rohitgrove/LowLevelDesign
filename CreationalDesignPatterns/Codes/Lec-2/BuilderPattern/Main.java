
import Models.ICar;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);
        // guidence Dedo
        director.constructor(false, false, true);

        ICar car = builder.build();
    }
}