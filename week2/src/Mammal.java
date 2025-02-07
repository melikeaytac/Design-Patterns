public class Mammal extends Animal{

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" makes a mammal sound.");
    }

    public void run() {
        System.out.println(name+" is running.");
    }
}

