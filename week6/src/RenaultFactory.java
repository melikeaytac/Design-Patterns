public class RenaultFactory extends CarFactory{
    @Override
    Car createCar(String bodyType) {
        Car car = null;
        if(bodyType.equals("SUV")) car = new RenaultSUV();
        if(bodyType.equals("Hatchback")) car = new RenaultHatchback();
        if (bodyType.equals("Sedan")) car = new RenaultSedan();

        return car;
    }
}
