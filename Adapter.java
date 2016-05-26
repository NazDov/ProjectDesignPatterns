package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class Adapter implements Target {

    private Strategy strategy;

    public Adapter(Strategy instance) {
        this.strategy=instance;
    }



    @Override
    public void addMessages(String... msgs) {
        for(String msg: msgs){
            strategy.print(msg);
        }
    }
}
