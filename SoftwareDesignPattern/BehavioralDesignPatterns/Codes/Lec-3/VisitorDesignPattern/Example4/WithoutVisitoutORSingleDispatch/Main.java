public class Main {
    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.makeSound(); // Calls Dog's makeSound() (Single Dispatch)
    }
}
