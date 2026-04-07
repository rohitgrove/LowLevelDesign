public class Main{
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();

        sparrow.eat(); // Sparrow is eating
        sparrow.walk(); // Sparrow is walking

        ostrich.eat(); // Ostrich is eating
        ostrich.walk(); // Ostrich is walking

        penguin.eat(); // Penguin is eating
        penguin.walk(); // Penguin is walking
    }
}