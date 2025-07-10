// Adding a new shape or color requires creating more subclasses!

public class Main{
    public static void main(String[] args) {
        Shape redCircle = new RedCircle();
        redCircle.draw();

        Shape blueSquare = new BlueSquare();
        blueSquare.draw();
    }
}