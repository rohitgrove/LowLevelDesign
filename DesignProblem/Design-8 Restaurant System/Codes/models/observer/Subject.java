package models.observer;

public interface Subject {
    public void addObserver(Observer obs);

    public void removeObserver(Observer obs);

    public void notifyObservers();
}
