package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class Runner {

    Strategy strategy;
    String message;


    public Runner(Strategy strategy, String message){
        this.strategy=strategy;
        this.message=message;
    }


    public void run() {

        strategy.print(message);
    }


}
