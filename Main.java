package ProjectDesignPatterns;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        String msg = "Hello World";

        //we have now hid the Runner implementation from the main method
        Runner runner = RunnerFactory.create();

        runner.addObserver((new Adapter(ConsoleOutputStrategy.getInstance())));
        InMemoryStrategy strategy = new InMemoryStrategy();

        runner.addObserver((new Adapter(strategy)));

        Handler handler = new HelloWorldHandler(new MotionSymbol("@"));
        handler.addNext(new HelloWorldHandler(new MotionSymbol(":)")));
        runner.addHandler(handler);

        Component comp = runner;

        comp =new ToUpperCaseDecorator(comp);

        comp.run(msg);

    }


}
