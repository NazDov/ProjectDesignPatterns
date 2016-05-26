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
        Strategy strategy = new InMemoryStrategy();


        new Runner(strategy,"Hello World").run();
    }


}
