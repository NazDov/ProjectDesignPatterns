package ProjectDesignPatterns;

/**
 * Created by User on 28.05.2016.
 */
public class HappyFactory implements AbstractFactory {

    @Override
    public EmotionProduct getSymbol() {
        return new HappySymbolEmotionProduct();
    }

    @Override
    public EmotionProduct getSmile() {
        return new HappySmileEmotionProduct();
    }
}
