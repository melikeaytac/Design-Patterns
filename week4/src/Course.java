import java.util.List;

public class Course implements Subject{
    String name;
    List<Observer> courseList;
    public Course(String name) {
        this.courseList = courseList;
        this.name = name;
    }


    @Override
    public void registerObserver(Observer o) {
            courseList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
            courseList.remove(o);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer:courseList){
            observer.update(name,message);
        }
    }


}
