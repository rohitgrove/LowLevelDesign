// Step 2: Subject Interface (YouTube Channel)
public interface YouTubeChannel {
    public void subscribe(Subscriber subscriber);

    public void unsubscribe(Subscriber subscriber);

    public void notifySubscribers(String videoTitle);
}
