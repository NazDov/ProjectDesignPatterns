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
        new Runner(new Strategy(){

            public void print(String message) {
                System.out.println(message);
            }
        },"Hello World").run();
    }


}
