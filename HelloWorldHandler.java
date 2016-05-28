package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class HelloWorldHandler extends Handler {


    @Override
    public void handle(Request request) {

        String s = request.getMessage().toLowerCase();

        if(s.contains("hello") && s.contains("world")){
            request.setMessage(request.getMessage()+"!");
        }

        super.handle(request);
    }
}
