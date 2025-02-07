import java.util.ArrayList;

public class AnimalEcosystemDemo {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        Ecosystem ec = new Ecosystem(animal);
        Animal lion = new Mammal("Lion",1);
        Animal eagle = new Bird("Eagle",2,2.1);
        Animal Salmon = new Fish("Salmon",3,"Silver");
        ec.animals.add(lion);
        ec.animals.add(eagle);
        ec.animals.add(Salmon);

        ec.simulateDay();




    }
}
