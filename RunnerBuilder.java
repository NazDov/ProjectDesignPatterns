package ProjectDesignPatterns;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by User on 28.05.2016.
 */
public class RunnerBuilder {

    private Component component;

    public RunnerBuilder(){

        this.setComponent(RunnerFactory.create());
    }

    private static RunnerBuilder runnerBuilder = new RunnerBuilder();

    public static RunnerBuilder forStrategy(Strategy instance) {

        ((Runner)runnerBuilder.component).addObserver(new Adapter(instance));

        return runnerBuilder;
    }


    public static RunnerBuilder addCommand(Command addSmileCommand) {

        ((Runner)runnerBuilder.component).addHandler(new HelloWorldHandler(addSmileCommand));

        return runnerBuilder;
    }

    public void setComponent(Runner component) {
        this.component = component;
    }

    public static RunnerBuilder addHandler(Handler handler) {

        ((Runner)runnerBuilder.component).addHandler(handler);

        return runnerBuilder;

    }

    public static RunnerBuilder addDecorator(Class<? extends Component> decoratorType) {


        try {

            try {
                Component addComponent = runnerBuilder.component;

                if (decoratorType == ReplaceSpaceTo.class) {
                    addComponent = decoratorType.getConstructor(Component.class, String.class).newInstance(addComponent, "-");
                } else {

                    addComponent = decoratorType.getConstructor(Component.class).newInstance(addComponent);
                }

                runnerBuilder.component = addComponent;


            } catch (Exception e) {
                e.printStackTrace();
            }

        }catch(Exception e){
            e.printStackTrace();
        }



        return runnerBuilder;
    }



    public static Component createComponent(){
        return runnerBuilder.component;
    }


}
