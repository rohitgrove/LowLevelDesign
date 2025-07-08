// Step 4: Use the factory in the main method
public class Main {
    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone("android");
        Phone iphone = PhoneFactory.getPhone("iphone");

        android.display();
        iphone.display();
    }
}
