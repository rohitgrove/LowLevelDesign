import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    // CACHE/POOL/MEMORY/RAM: SHARED OBJECTS
    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating Circle of color: " + color);
        }
        return circle;
    }
}