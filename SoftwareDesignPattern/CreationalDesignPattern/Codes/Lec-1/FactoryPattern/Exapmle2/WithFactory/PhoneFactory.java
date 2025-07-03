// Step 3: Create a factory class (Factory)
public class PhoneFactory {
    public static Phone getPhone(String type) {
        if (type.equalsIgnoreCase("android")) {
            return new AndroidPhone();
        } else if (type.equalsIgnoreCase("iphone")) {
            return new IPhone();
        }
        return null;
    }
}
