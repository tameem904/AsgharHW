package class13;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Batch 16 is good";
        str=str.replace("good","Excellent");
        System.out.println(str);
        str=str.replace('e', 'E');
        System.out.println(str);
    }
}
