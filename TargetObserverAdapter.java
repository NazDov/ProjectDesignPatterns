package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class TargetObserverAdapter implements Observer {

    private Target target;

    public TargetObserverAdapter(Target target) {
        this.target=target;
    }

    @Override
    public void handleEvent(String input) {
        target.addMessages(input);
    }
}
