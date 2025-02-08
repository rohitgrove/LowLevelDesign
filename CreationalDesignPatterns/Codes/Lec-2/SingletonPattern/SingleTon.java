public class SingleTon {
    private static SingleTon instance;

    private SingleTon() {
        System.out.println("constructor ke andar hu, instance created");
    }

    public static SingleTon getInsance() {
        if (instance == null) {
            instance = new SingleTon();
        }

        return instance;
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(() -> {SingleTon.getInsance();});
        Thread th2 = new Thread(() -> {SingleTon.getInsance();});

        th1.start();
        th2.start();
    }
}
