public class Main {
    public static void functionCalling(Human human) {
        human.eat();
        human.sleep();
    }

    public static void main(String[] args) {
        Adult Adult = new Adult();
        Child Child = new Child();
        Adult.eat();
        Adult.sleep();
        Adult.eatDinner();
        Adult.work();
        Child.eat();
        Child.eat();
        Child.childishBehaviour();
    }
}
