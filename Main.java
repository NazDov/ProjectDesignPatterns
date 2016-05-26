package ProjectDesignPatterns;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        new ToUpperCaseDecorator(new Runner(new Adapter(ConsoleOutputStrategy.getInstance()))).run("Hello World");
    }


}
