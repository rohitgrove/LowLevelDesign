// Client - ecommerce customer
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Payment payment = new Payment();
        Shipping shipping = new Shipping();

        inventory.checkStock();
        payment.makePayment();
        shipping.arrangeShipping();
    }
}
