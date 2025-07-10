// Concrete Flyweight
public class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing Circle: Color: " + color + ", X: " + x + ", Y: " + y + ", Radius: " + radius);
    }
}