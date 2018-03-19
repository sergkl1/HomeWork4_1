package task2;

import java.time.LocalDateTime;

/**
 * Created by sergey.kliepikov on 3/17/18.
 */
public class Message {
    private final String author;
    private final LocalDateTime time;
    private final Text text;

    public Message(String author, LocalDateTime time, Text text) {
        this.author = author;
        this.time = time;
        this.text = text;
    }

    @Override
    public String toString() {
        return author + " wrote at " + time + ": " + text.toDisplay() + '\n';
    }
}
