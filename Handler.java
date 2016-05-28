package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public abstract class Handler {

    private Handler next;


    public void addNext(Handler next){
        this.next=next;
    }


    public void handle(Request request) {

        //do something


        if(next!=null)
            next.handle(request);

    }
}
