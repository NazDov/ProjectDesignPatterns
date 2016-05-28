package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class Request {

    private String message;

    public Request(String msg) {
        message=msg;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
