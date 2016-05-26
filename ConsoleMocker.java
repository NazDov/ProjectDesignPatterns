package ProjectDesignPatterns;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by User on 26.05.2016.
 */
public class ConsoleMocker {

    private PrintStream originalWriter = System.out;
    private OutputStream os ;
    private PrintStream pw;

    public ConsoleMocker(){

        os = new ByteArrayOutputStream();
        pw = new PrintStream(os);
        System.setOut(pw);
    }

    public String getOutput(){

        String output=os.toString();

        clean();

        return output;
    }

    public void clean(){
        System.setOut(originalWriter);
    }

}
