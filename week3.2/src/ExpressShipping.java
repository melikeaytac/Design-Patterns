public class ExpressShipping implements ShippingStrategy{
    @Override
    public void ship() {
        System.out.println("ExpressShipping ");

    }

    @Override
    public double getCost() {
        return 10;
    }
}
