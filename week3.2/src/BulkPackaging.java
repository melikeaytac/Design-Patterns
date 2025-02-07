public class BulkPackaging implements PackagingStrategy{
    @Override
    public void pack() {
        System.out.println("BulkPackaging ");

    }

    @Override
    public double getCost() {
        return 10;
    }
}
