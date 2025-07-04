import Models.ICar;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new ScorpioBuilder();
        Director director = new Director(builder);
        // guidence dedo
        director.construct(false, true, true);

        ICar car = builder.Build();
    }
}
