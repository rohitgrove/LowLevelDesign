public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User receiver, String message) {
        System.out.println(this.name + " sends: " + message + " to " + receiver.getName());
        receiver.receiveMessage(message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }

    public String getName() {
        return name;
    }
}