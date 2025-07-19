// Step 1: Observer Interface (Subscribers)
public interface Subscriber {
    public void update(String videoTitle);

    public String getName();
}