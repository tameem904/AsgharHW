package class13;

public class Task03 {
    public static void main(String[] args) {
        String str="Is it Saturday? Is it raining? Do we have Java class today?";

        String strArray[]=str.split("[?]");
        System.out.println(strArray.length);

    }
}
