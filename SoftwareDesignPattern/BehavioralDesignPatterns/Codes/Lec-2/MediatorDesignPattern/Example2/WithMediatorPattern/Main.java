// Step 4: Client
public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User amit = new User("Amit", chatRoom);
        User raj = new User("Raj", chatRoom);

        amit.sendMessage("Hello, Raj!");
        raj.sendMessage("Hi, Amit!");
    }
}