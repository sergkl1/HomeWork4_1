package task2;

import java.time.LocalDateTime;

/**
 * Created by sergey.kliepikov on 3/17/18.
 */
public class MessengerRunner {

    public static void main(String[] args) {
        Text plainText1 = new PlainText("Hi man!");
        Text plainText2 = new PlainText("Hi nigga!");
        Text emoticonText1 = new EmoticonText("winking-face");
        Text emoticonText2 = new EmoticonText("ghost");
        Text pictureText1 = new PictureText("like");
        Text pictureText2 = new PictureText("heart");

        Message message1 = new Message("Vasya", LocalDateTime.now(), plainText1);
        Message message2 = new Message("Petya", LocalDateTime.now(), plainText2);
        Message message3 = new Message("Vasya", LocalDateTime.now(), emoticonText1);
        Message message4 = new Message("Petya", LocalDateTime.now(), emoticonText2);
        Message message5 = new Message("Vasya", LocalDateTime.now(), pictureText1);
        Message message6 = new Message("Petya", LocalDateTime.now(), pictureText2);

        Dialog dialog = new Dialog();
        dialog.addMessage(message1);
        dialog.addMessage(message2);
        dialog.addMessage(message3);
        dialog.addMessage(message4);
        dialog.addMessage(message5);
        dialog.addMessage(message6);

        System.out.println(dialog);
    }
}
