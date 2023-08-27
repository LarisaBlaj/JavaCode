package variables;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;

public class StringExamples {
    public static void main(String[] args) {
        String text ="This is a text";

        System.out.println(text);

        System.out.println(text.toUpperCase());

        text=text.toLowerCase();
        System.out.println(text);

        int lenghtOfText =text.length();
        System.out.println("Lungimea textului este: "+ lenghtOfText);

        System.out.println(text.concat("").concat("alt text"));

        System.out.println(text.indexOf("text"));

        String anotherText = "This is a text";

        System.out.println(text.equals(anotherText));

        System.out.println(text.equalsIgnoreCase(anotherText));

        System.out.println(anotherText.replaceAll(" ", ","));

        System.out.println(anotherText.contains("is"));

    }
}
