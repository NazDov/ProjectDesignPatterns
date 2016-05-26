package ProjectDesignPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2016.
 */
public class SimpleObserver implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if(observer!=null)
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyAll(String input) {

        for(Observer o: observers){
            o.handleEvent(input);
        }

    }
}
