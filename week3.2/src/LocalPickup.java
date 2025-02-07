public class LocalPickup implements ShippingStrategy{
    @Override
    public void ship() {
        System.out.println("LocalPickup");
    }

    @Override
    public double getCost() {
        return 10;
    }
}
