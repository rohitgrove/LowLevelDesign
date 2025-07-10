public class Circle {
    private String color;
    private int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle: Color: " + color + ", X: " + x + ", Y: " + y + ", Radius: " + radius);
    }
}