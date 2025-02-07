public class Order {

    ShippingStrategy shippingStrategy;
    PackagingStrategy packagingStrategy;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    int orderID;
    public ShippingStrategy getShippingStrategy() {
        return shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public PackagingStrategy getPackagingStrategy() {
        return packagingStrategy;
    }

    public void setPackagingStrategy(PackagingStrategy packagingStrategy) {
        this.packagingStrategy = packagingStrategy;
    }

    public void fulfillOrder(){
        System.out.println("Order ID "+getOrderID());
        packagingStrategy.pack();
        System.out.println(getPackagingStrategy().getCost());
        shippingStrategy.ship();
        System.out.println(getShippingStrategy().getCost());
        System.out.println("Total :"+ (getPackagingStrategy().getCost()+getShippingStrategy().getCost()));


    }

}
