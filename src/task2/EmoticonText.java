package task2;

/**
 * Created by sergey.kliepikov on 3/19/18.
 */
public class EmoticonText implements Text{

    private final String emoticon;

    public EmoticonText(String emoticonText) {
        if (emoticonText.equalsIgnoreCase("winking-face")) {
            this.emoticon = ";)";
        }
        else if (emoticonText.equalsIgnoreCase("ghost")) {
            this.emoticon = "XX)";
        }
        else this.emoticon = "Unknown emoticon";
    }

    @Override
    public String toDisplay() {
        return emoticon;
    }
}
