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
        AbstractFactory factory = new SadFactory();
        process(msg, factory);


    }

    private static void process(String msg, AbstractFactory factory) {
        //we have now hid the Runner implementation from the main method
        Runner runner = RunnerFactory.create();
        runner.addObserver((new Adapter(ConsoleOutputStrategy.getInstance())));

        InMemoryStrategy strategy = new InMemoryStrategy();

        runner.addObserver((new Adapter(strategy)));


        runner.addHandler(new HelloWorldHandler(new AddSymbolCommand(factory)));
        runner.addHandler(new HelloWorldHandler(new AddSmileCommand(factory)));

        Component comp = runner;

        comp =new ToUpperCaseDecorator(comp);

        comp.run(msg);
    }


}
