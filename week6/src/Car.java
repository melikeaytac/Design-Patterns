public class Car {
    String modelName;
    double weight;
    double acceleration;
    double topSpeed;
    double price;
    String originCountry;

    String productionTime;
    String deliveryTime;

    public Car(String modelName, double weight, double acceleration, double topSpeed, double price, String originCountry, String productionTime, String deliveryTime) {
        this.modelName = modelName;
        this.weight = weight;
        this.acceleration = acceleration;
        this.topSpeed = topSpeed;
        this.price = price;
        this.originCountry = originCountry;
        this.productionTime = productionTime;
        this.deliveryTime = deliveryTime;
    }

    void displaySpecs(){
        System.out.println("Model name:"+modelName+"\n Weight : "+ weight + "kg \n Acceleration(0-10m) "+acceleration +"Price" +price);
    }
    void displayOriginCountry(){
        System.out.println("origin country: "+originCountry);
    }
    void   displayProductionTime(){
        System.out.println("Production Time : "+productionTime);
    }
    void displayDeliveryTime(){
        System.out.println("Delivery Time: "+ deliveryTime);
}


}
