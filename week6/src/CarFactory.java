public  abstract class CarFactory {
    public Car orderCar(String bodyType){
        Car car;
        car= createCar(bodyType);
        car.displaySpecs();
        car.displayProductionTime();
        car.displayOriginCountry();
        car.displayDeliveryTime();
        return car;
    }
    abstract Car createCar(String bodyType);
}