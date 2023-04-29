package class12;

import java.util.Locale;

public class E8StringDemo {
    public static void main(String[] args) {

        String sentence="Java is very very easy";
        sentence=sentence.toString().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));


    }
}
