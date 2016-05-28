package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class HelloWorldHandler extends Handler {


    private MotionSymbol symbol;

    public HelloWorldHandler(MotionSymbol symbol){
        this.symbol=symbol;
    }



    @Override
    protected void handleRequest(Request request) {
        String s = request.getMessage().toLowerCase();

        if(s.contains("hello") && s.contains("world")){

            request.setMessage(request.getMessage()+ symbol.getSymbol());
        }

    }
}
