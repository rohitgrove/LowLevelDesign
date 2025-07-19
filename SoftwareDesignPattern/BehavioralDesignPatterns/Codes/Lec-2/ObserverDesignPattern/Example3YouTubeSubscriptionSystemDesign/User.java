// Step 4: Concrete Observers (Subscribers)
public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received a notification: New Video - " + videoTitle);
    }

    public String getName() {
        return name;
    }
}