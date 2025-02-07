import java.util.ArrayList;

public class Ecosystem {
    public ArrayList<Animal> animals;

    public Ecosystem(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void simulateDay() {
        System.out.println("A day in the ecosystem:");
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }

            animal.sleep();
            System.out.println();
        }
    }
}
