package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public abstract class Decorator implements Component{

    private Component component;

    protected Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void run(String msg) {
        component.run(msg);
    }
}
