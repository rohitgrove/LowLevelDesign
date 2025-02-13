public class Main {
    public static void main(String[] args) {
        // int[][] locationTejas;
        Tejas plane = new Tejas();
        for (int i = 0; i < 5; i++) {
            // fetch from location array
            int srcX = 5;
            int srcY = 5;

            int dextX = 100;
            int dextY = 515;
            int speed = 15;
            System.out.println("Time: " + plane.getTotalTimeToReachDestination(srcX, srcY, dextX, dextY, speed));
        }
    }
}