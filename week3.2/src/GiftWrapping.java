public class GiftWrapping implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("GiftWrapping");
    }

    @Override
    public double getCost() {
        return 10;
    }
}
