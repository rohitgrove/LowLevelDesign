// Client
public class Main {
    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle("Red");
        redCircle.draw(10, 20, 30);

        Shape blueCircle = ShapeFactory.getCircle("Blue");
        blueCircle.draw(15, 25, 35);

        Shape anotherRedCircle = ShapeFactory.getCircle("Red");
        anotherRedCircle.draw(50, 60, 70);
    }
}