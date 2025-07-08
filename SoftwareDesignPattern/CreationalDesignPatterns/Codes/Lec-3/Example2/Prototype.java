// Step 1: Prototype Interface
public interface Prototype {
    Prototype clone();

    public void setEngine(CarEngine carEngine);

    public void setModel(int model);
}
