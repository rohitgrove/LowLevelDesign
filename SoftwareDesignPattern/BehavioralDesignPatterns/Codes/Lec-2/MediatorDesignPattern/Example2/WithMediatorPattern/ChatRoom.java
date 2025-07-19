// Step 2: Concrete Mediator
public class ChatRoom implements ChatMediator {
    @Override
    public void sendMessage(String message, User user) {
        System.out.println(user.getName() + " sent: " + message);
    }
}