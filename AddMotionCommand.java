package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class AddMotionCommand implements Command {


    private String symbol;

    public AddMotionCommand(String symbol) {

        this.symbol=symbol;
    }


    @Override
    public void change(Request request) {
        request.setMessage(request.getMessage()+symbol);
    }
}
