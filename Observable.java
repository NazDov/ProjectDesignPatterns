package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAll(String input);

}
