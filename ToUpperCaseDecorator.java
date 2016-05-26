package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class ToUpperCaseDecorator extends Decorator  {


    public ToUpperCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public void run(String msg) {

        super.run(msg.toUpperCase());
    }
}
