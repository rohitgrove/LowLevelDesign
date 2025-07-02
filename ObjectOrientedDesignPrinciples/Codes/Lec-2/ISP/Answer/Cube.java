public class Cube implements ThreeDimensionalShape {
    @Override
    public void display() {
        System.out.println("Cube Showing");
    }

    @Override
    public double volume() {
        return 4 * 5;
    }
}
