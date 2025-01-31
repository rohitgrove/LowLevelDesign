public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Keyboard", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB cable", 2, 5);

        System.out.println(order.totalPrice());

        // PaymentProcessor processor = new PaymentProcessor();
        // processor.pay(order, "0372846", "debit");

        PaymentProcessor processor = new DebitPaymentProcessor();
        processor.pay(order, "y3743y7");
    }
}