// Step 2: Define the Shape hierarchy
// Abstraction: Shape links to Color via composition
public abstract class Shape {
    protected Color color; // Bridge to Color (Composition)

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw(); // Abstract method for drawing
}
