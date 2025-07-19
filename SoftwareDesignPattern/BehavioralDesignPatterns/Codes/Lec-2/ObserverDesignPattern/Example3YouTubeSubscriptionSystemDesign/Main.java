// Step 5: Client Code (Main Function)
public class Main {
    public static void main(String[] args) {
        // Creating the YouTube Channel (Subject)
        TechYouTubeChannel channel = new TechYouTubeChannel("10xTech Infinity");

        // Creating Subscribers (Observers)
        User subscriber1 = new User("Subscriber 1");
        User subscriber2 = new User("Subscriber 2");
        User subscriber3 = new User("Subscriber 3");

        // Subscribing Users to the Channel
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        // Publishing a New Video
        channel.notifySubscribers("Observer Design Pattern Explained");

        // Unsubscribing a User
        channel.unsubscribe(subscriber2);

        // Publishing Another Video
        channel.notifySubscribers("Singleton Design Pattern Tutorial");
    }
}

/*
 * OUTPUT:
 * Subscriber 1 subscribed to 10xTech Infinity
 * Subscriber 2 subscribed to 10xTech Infinity
 * Subscriber 3 subscribed to 10xTech Infinity
 * 
 * ? 10xTech Infinity uploaded a new video: Observer Design Pattern Explained
 * Subscriber 1 received a notification: New Video - Observer Design Pattern
 * Explained
 * Subscriber 2 received a notification: New Video - Observer Design Pattern
 * Explained
 * Subscriber 3 received a notification: New Video - Observer Design Pattern
 * Explained
 * Subscriber 2 unsubscribed from 10xTech Infinity
 * 
 * ? 10xTech Infinity uploaded a new video: Singleton Design Pattern Tutorial
 * Subscriber 1 received a notification: New Video - Singleton Design Pattern
 * Tutorial
 * Subscriber 3 received a notification: New Video - Singleton Design Pattern
 * Tutorial
 */