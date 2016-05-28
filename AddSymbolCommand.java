package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class AddSymbolCommand implements Command {

    private AbstractFactory factory;

    public AddSymbolCommand(AbstractFactory factory) {
        this.factory=factory;
    }

    @Override
    public void change(Request request) {
        request.setMessage(request.getMessage()+factory.getSymbol().get());
    }
}
