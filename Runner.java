package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public interface Runner extends Component {
    void addObserver(Target target);

    void addHandler(Handler handler);
}
