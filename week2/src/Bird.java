public class Bird extends Animal implements Flyable{

    double wingspan;


    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println(name+ " chirps.");
    }

    @Override
    public void fly() {
        System.out.println(name+ " is flying with its"+wingspan+" meter wingspan.");
    }
}
