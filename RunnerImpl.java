package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class RunnerImpl implements  Runner {

   private Observable observable = new SimpleObserver();

    @Override
    public void addObserver(Target target){

        observable.addObserver(new TargetObserverAdapter(target));
    }

    @Override
    public void run(String msg) {

        observable.notifyAll(msg);
    }


}
