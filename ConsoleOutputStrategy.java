package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public final class ConsoleOutputStrategy implements Strategy {

    private static ConsoleOutputStrategy instance;

    private ConsoleOutputStrategy(){

    }

    public static ConsoleOutputStrategy getInstance() {

        return instance=(instance==null)?new ConsoleOutputStrategy():instance;
    }

    public void print(String message) {

        System.out.print(message);
    }
}
