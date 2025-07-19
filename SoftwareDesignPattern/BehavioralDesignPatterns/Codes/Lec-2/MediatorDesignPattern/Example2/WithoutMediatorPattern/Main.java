public class Main {
    public static void main(String[] args) {
        User user1 = new User("Raj");
        User user2 = new User("Amit");

        user1.sendMessage(user2, "Hello");
        user2.sendMessage(user1, "Ha Bol");
    }
}

/*
 * OUTPUT:
 * Raj sends: Hello to Amit
 * Amit received: Hello
 * Amit sends: Ha Bol to Raj
 * Raj received: Ha Bol
 */