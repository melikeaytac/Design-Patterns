import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Library implements Subject{
    String name;

    List<Observer> LibraryList;

    public Library(String name){
        this.LibraryList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer o) {
        LibraryList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        LibraryList.remove(o);
    }

    @Override
    public void notifyObserver( String message) {
        for (Observer observer:LibraryList){
            observer.update(name, message);
        }
    }


}
