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

        Component component = new Runner(new Adapter(ConsoleOutputStrategy.getInstance()));

        component = new ToUpperCaseDecorator(component);

        String replacement = "-";

        component= new ReplaceSpaceTo(component, replacement);

        component.run(msg);
    }


}
