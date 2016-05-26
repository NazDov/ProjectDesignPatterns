package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class Runner implements Component {

    Target target;

    public Runner(Target target){
        this.target=target;
    }


    public void run(String msg) {

        target.addMessages(msg);
    }


}
