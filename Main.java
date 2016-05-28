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

        Runner runner = new Runner();

        runner.addObserver((new Adapter(ConsoleOutputStrategy.getInstance())));
        InMemoryStrategy strategy = new InMemoryStrategy();

        runner.addObserver((new Adapter(strategy)));

        Component comp = runner;

        comp =new ToUpperCaseDecorator(comp);

        comp =new ReplaceSpaceTo(comp,"-");

        comp.run(msg);

    }


}
