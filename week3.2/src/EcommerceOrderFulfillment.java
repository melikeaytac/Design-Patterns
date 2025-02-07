import java.util.Scanner;

public class EcommerceOrderFulfillment {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderID(1);
        order.setShippingStrategy(new StandardShipping());
        order.setPackagingStrategy(new MinimalPackaging());
        order.fulfillOrder();

    }
}
