package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class ToUpperCaseDecorator implements Component {

    private Component runner;

    public ToUpperCaseDecorator(Component runner) {
        this.runner=runner;
    }

    @Override
    public void run(String msg) {

        runner.run(msg.toUpperCase());
    }
}
