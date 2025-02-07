public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        System.out.println(chair.sitOn());
        System.out.println(table.placeItem());
    }
}
