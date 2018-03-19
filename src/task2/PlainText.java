package task2;

/**
 * Created by sergey.kliepikov on 3/17/18.
 */
public class PlainText implements Text{
    private final String plainText;

    public PlainText(String plainText) {
        this.plainText = plainText;
    }

    @Override
    public String toDisplay() {
        return plainText;
    }
}
