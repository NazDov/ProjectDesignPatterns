package ProjectDesignPatterns;

/**
 * Created by User on 26.05.2016.
 */
 class RunnerImpl implements  Runner {

   private Observable observable = new SimpleObserver();
    private Handler handler = Handler.NULL;


     RunnerImpl(){

    }

    @Override
    public void addObserver(Target target){

        observable.addObserver(new TargetObserverAdapter(target));
    }

    @Override
    public void addHandler(Handler handler) {

        if(this.handler==Handler.NULL) {
            this.handler = handler;
        }else{
            this.handler.addNext(handler);
        }
    }

    @Override
    public void run(String msg) {

        //pass to handler

        final Request request = new Request(msg);

         handler.handle(request);

        //pass to observer
        observable.notifyAll(request.getMessage());
    }


}
