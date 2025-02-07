public class MinimalPackaging implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("MinimalPackaging");
    }

    @Override
    public double getCost() {
        return 10;
    }
}
