package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class AddSmileCommand implements Command {


    private AbstractFactory factory;

    public AddSmileCommand(AbstractFactory factory) {

        this.factory=factory;
    }


    @Override
    public Request change(Request request) {
        Request changedReq = new Request(request.getMessage()+factory.getSmile().get());

        return changedReq;
    }
}
