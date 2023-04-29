package class14;

public class E6 {

    boolean evenOrOdd(int num) {
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }


    public static void main(String[] args) {
        int num=30;
        E6 n=new E6();
        boolean result=n.evenOrOdd(num);
        System.out.println(result);
    }

}