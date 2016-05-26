package ProjectDesignPatterns;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        new Runner(new Adapter(ConsoleOutputStrategy.getInstance(),"Hello World")).run();
    }


}
