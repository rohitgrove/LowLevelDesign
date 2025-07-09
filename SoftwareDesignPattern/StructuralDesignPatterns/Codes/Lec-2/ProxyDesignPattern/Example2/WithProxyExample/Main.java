public class Main {
    public static void main(String[] args) {
        Database unauthorizedProxy = new DatabaseProxy(false);
        unauthorizedProxy.connect();
        unauthorizedProxy.fetchData();

        System.out.println("---");

        Database authorizedProxy = new DatabaseProxy(true);
        authorizedProxy.connect();
        authorizedProxy.fetchData();
    }
}
