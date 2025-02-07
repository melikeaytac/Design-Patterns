public class Fish extends Animal implements Swimmable{
    String scaleColor;

    public Fish(String name, int age, String scaleColor) {
        super(name, age);
        this.scaleColor = scaleColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name+" doesn't make a sound.");
    }

    @Override
    public void swim() {

        System.out.println(name+" is swimming with its "+scaleColor+" scales shimmering.");
    }
}
