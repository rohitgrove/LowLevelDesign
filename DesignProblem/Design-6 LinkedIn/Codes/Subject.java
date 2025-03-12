public interface Subject {
    public void attach(Observer observer);

    public void detach(Observer observer);

    public void Notify(); // Note: In Java, notify() is a method in Object class, consider renaming in real code
}
