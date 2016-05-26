package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class Runner {

    Target target;

    public Runner(Target target){
        this.target=target;
    }


    public void run() {

        target.addMessages(2);
    }


}
