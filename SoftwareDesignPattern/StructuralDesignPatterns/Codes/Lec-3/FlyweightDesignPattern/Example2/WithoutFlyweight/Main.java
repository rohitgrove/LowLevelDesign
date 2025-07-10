public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Red", 10, 20, 30);
        Circle circle2 = new Circle("Blue", 15, 25, 35);
        Circle circle3 = new Circle("Red", 50, 60, 70);
        
        circle1.draw();
        circle2.draw();
        circle3.draw();
    }
}
