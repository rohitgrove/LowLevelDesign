public class SingletonLazy {
    private SingletonLazy() {
        System.out.println("constructor ke andar hu, instance created");
    }

    private static class Holder {
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        return Holder.INSTANCE;
    }

    public static void main(String[] args) {
        // SingletonLazy obj1 = SingletonLazy.getInstance();
        // SingletonLazy obj2 = SingletonLazy.getInstance();
        Thread th1 = new Thread(() -> {SingletonLazy.getInstance();});
        Thread th2 = new Thread(() -> {SingletonLazy.getInstance();});

        th1.start();
        th2.start();
    }
}
