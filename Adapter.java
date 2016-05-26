package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class Adapter implements Target {

    private Strategy strategy;
    private String msg;

    public Adapter(Strategy instance, String msg) {
        this.strategy=instance;
        this.msg=msg;
    }

    @Override
    public void addMessages(int number) {

        StringBuilder sBuild = new StringBuilder();
        for(int i=0; i<number; i++){

            sBuild.append(msg);
            sBuild.append(System.lineSeparator());
        }

        strategy.print(sBuild.toString());
    }
}
