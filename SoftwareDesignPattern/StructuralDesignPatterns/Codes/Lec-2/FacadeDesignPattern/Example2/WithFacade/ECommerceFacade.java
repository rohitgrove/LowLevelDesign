// Facade
public class ECommerceFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public ECommerceFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public void placeOrder() {
        inventory.checkStock();
        payment.makePayment();
        shipping.arrangeShipping();
        System.out.println("Order placed successfully!");
    }
}
