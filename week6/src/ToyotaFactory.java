public class ToyotaFactory extends CarFactory{

    @Override
    Car createCar(String bodyType) {
        Car car = null;
        if(bodyType.equals("SUV")) car = new ToyotaSUV();
        if(bodyType.equals("Hatchback")) car = new ToyotaHatchback();
        if (bodyType.equals("Sedan")) car = new ToyotaSedan();

        return car;
    }
}
