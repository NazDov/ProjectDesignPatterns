package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class HelloWorldHandler extends Handler {


    private Command command;

    public HelloWorldHandler(Command command){
        this.command =command;
    }



    @Override
    protected Request handleRequest(Request request) {
        String s = request.getMessage().toLowerCase();



        if(s.contains("hello") && s.contains("world")){

            request = command.change(request);
        }

        return request;

    }
}
