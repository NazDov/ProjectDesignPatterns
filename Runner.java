package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
public class Runner implements Component {

   private Observable observable = new SimpleObserver();

    public void addObserver(Target target){

        observable.addObserver(new TargetObserverAdapter(target));
    }


    public void run(String msg) {

        observable.notifyAll(msg);
    }


}
