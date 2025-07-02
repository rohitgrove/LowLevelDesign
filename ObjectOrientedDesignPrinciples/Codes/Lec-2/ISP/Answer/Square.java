public class Square implements TwoDimensionalShape {
    @Override
    public void display() {
        System.out.println("Square Showing");
    }

    @Override
    public double area() {
        return 4 * 4;
    }
}
