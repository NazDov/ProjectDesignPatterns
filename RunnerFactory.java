package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class RunnerFactory {

    public static Runner create() {
        return new RunnerImpl();
    }
}
