public class Student implements Observer {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String name, String message) {
        System.out.println("Student "+name+" received from "+message);

    }
}
