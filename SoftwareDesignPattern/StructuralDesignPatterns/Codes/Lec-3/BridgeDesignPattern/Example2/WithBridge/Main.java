public class Main {
    public static void main(String[] args) {
        // Create colors
        Color red = new Red();
        Color blue = new Blue();

        // Create shapes with colors
        Shape redCircle = new Circle(red);
        Shape blueSquare = new Square(blue);

        // Draw shapes
        redCircle.draw(); // Output: Drawing Circle - Applying Red color
        blueSquare.draw(); // Output: Drawing Square - Applying Blue color
    }
}
