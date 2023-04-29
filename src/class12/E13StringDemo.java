package class12;

public class E13StringDemo {
    public static void main(String[] args) {
        String sentence="yup we have another class";
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(12,19));
        System.out.println(sentence.length());
        int startIndex=sentence.length()-3;
        System.out.println(sentence.substring(startIndex));
    }
}
