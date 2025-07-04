import Models.ICar;

public interface ICarBuilder {
    public void buildEngine();

    public void buildChassis();

    public void buildTyre();

    public void buildBodyShell();

    // belowmethod returns the final object
    public ICar Build();
}
