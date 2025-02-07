public class StandardShipping implements ShippingStrategy {
    @Override
    public void ship() {
        System.out.println("StandardShipping");
    }

    @Override
    public double getCost() {
        return 10;
    }
}
