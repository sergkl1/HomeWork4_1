package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.kliepikov on 3/17/18.
 */
public class Dialog {
    private List<Message> conversation = new ArrayList<>();

    public void addMessage(Message message) {
        conversation.add(message);
    }

    @Override
    public String toString() {
        return " " + conversation;
    }
}
