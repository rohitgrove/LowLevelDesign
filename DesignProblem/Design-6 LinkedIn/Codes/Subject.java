public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notif(); // Note: In Java, notify() is a method in Object class, consider renaming in real code
}
