package ProjectDesignPatterns;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by User on 28.05.2016.
 */
public class RunnerBuilder {

    private Component component;

    public RunnerBuilder(){

        component = RunnerFactory.create();
    }



    public static RunnerBuilder forStrategy(Strategy instance) {

        RunnerBuilder runnerBuilder = new RunnerBuilder();

        ((Runner)runnerBuilder.component).addObserver(new Adapter(instance));

        return runnerBuilder;
    }


    public RunnerBuilder addCommand(Command addSmileCommand) {

        ((Runner)component).addHandler(new HelloWorldHandler(addSmileCommand));

        return this;
    }



    public  RunnerBuilder addHandler(Handler handler) {

        ((Runner)component).addHandler(handler);

        return this;

    }

    public  RunnerBuilder addDecorator(Class<? extends Component> decoratorType) {


        try {

            try {
                Component addComponent = component;

                if (decoratorType == ReplaceSpaceTo.class) {
                    addComponent = decoratorType.getConstructor(Component.class, String.class).newInstance(addComponent, "-");
                } else {

                    addComponent = decoratorType.getConstructor(Component.class).newInstance(addComponent);
                }

                component = addComponent;


            } catch (Exception e) {
                e.printStackTrace();
            }

        }catch(Exception e){
            e.printStackTrace();
        }



        return this;
    }



    public  Component createComponent(){
        return component;
    }


}
