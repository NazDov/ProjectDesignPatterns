package ProjectDesignPatterns;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        //setting new runner
        //
        Strategy strategy = new ConsoleOutputStrategy();


        new Runner(strategy,"Hello World").run();
    }


}
