public class Teacher implements Observer{

    String name ;

    public Teacher(String name) {
        this.name = name;
    }


    @Override
    public void update(String name, String message) {
        System.out.println("Teacher "+name+" received from "+message);

    }
}
