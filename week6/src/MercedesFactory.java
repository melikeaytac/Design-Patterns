public class MercedesFactory extends CarFactory{
    @Override
    Car createCar(String bodyType) {
        Car car = null;
        if(bodyType.equals("SUV")) car = new MercedesSUV();
        if(bodyType.equals("Hatchback")) car = new MercedesHatchback();
        if (bodyType.equals("Sedan")) car = new MercedesSedan();


        return car;
    }
}
