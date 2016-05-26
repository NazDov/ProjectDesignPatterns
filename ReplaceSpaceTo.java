package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class ReplaceSpaceTo extends Decorator {

    private String replacement;

    public ReplaceSpaceTo(Component component, String replacement) {
        super(component);
        this.replacement=replacement;
    }


    @Override
    public void run(String msg) {
        super.run(msg.replaceAll(" ", replacement));
    }
}
