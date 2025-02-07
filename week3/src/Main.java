public class Main {
    public static void main(String[] args) {
        SortingContext sc = new SortingContext();
        sc.setSs(new BubbleSort());
        sc.perform();

        sc.setSs(new QuickSort());
        sc.perform();
    }
}
