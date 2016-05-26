package ProjectDesignPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.05.2016.
 */
public class InMemoryStrategy implements Strategy {

    private List<String> messageList = new ArrayList<>();

    public List<String> getMessageList(){
        return messageList;
    }

    public void print(String message) {
        messageList.add(message);
    }
}
