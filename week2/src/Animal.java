public abstract class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void makeSound();

    public void eat(){
        System.out.println(name+" is eating.");
    }

    public void sleep(){
        System.out.println(name+" is sleeping.");

    }
}
