package class13;

public class Task02 {
    public static void main(String[] args) {
        String str="AZdDFadkfkdff123$$$&#1234";
        str=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str);
        System.out.println(str.length());

        }


}
