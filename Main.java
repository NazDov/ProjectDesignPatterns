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
        AbstractFactory factory = new HappyFactory();
        process(msg, factory);


    }

    private static void process(String msg, AbstractFactory factory) {
        //we have now hid the Runner implementation from the main method

        InMemoryStrategy inMemoryStrategy = new InMemoryStrategy();

        ConsoleOutputStrategy consoleOutputStrategy = ConsoleOutputStrategy.getInstance();

        Component runner = RunnerBuilder.forStrategy(consoleOutputStrategy)
                .addCommand(new AddSymbolCommand(factory))
                .addCommand(new AddSmileCommand(factory))
                .addDecorator(ToUpperCaseDecorator.class)
                .addDecorator(ReplaceSpaceTo.class)
                .createComponent();


        runner.run(msg);




    }


}
