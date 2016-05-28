package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class SadFactory implements AbstractFactory {
    @Override
    public EmotionProduct getSymbol() {
        return new SadSymbolEmotionProduct();
    }

    @Override
    public EmotionProduct getSmile() {
        return new SadSmileEmotionProduct();
    }
}
