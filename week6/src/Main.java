public class Main {
    public static void main(String[] args) {
        CarFactory mercedes = new MercedesFactory();
        CarFactory renault = new RenaultFactory();
        CarFactory toyota = new ToyotaFactory();

        Car toyotaCar = toyota.orderCar("Sedan");

        System.out.println(" ");
        Car mercedesCar = mercedes.orderCar("SUV");

        System.out.println(" ");
        Car renaultCar = renault.orderCar("Hatchback");

        System.out.println(" ");

    }
}
