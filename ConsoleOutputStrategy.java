package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class ConsoleOutputStrategy implements Strategy {

    public void print(String message) {

        System.out.print(message);
    }
}
