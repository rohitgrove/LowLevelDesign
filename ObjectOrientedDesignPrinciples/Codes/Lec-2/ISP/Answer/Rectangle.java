public class Rectangle implements TwoDimensionalShape {
    @Override
    public void display() {
        System.out.println("Rectangle Showing");
    }

    @Override
    public double area() {
        return 4 * 4;
    }
}
