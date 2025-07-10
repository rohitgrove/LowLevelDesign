// Refined Abstractions: Specific shapes
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle - ");
        color.applyColor(); // Delegate color behavior
    }
}
