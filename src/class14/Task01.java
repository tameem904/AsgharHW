package class14;

public class Task01 {

    void findLargest(int num1, int num2){
        if(num1>num2){
            System.out.println(num1+ " is largest");
        } else {
            System.out.println(num2+ " is the largest");
        }
    }

    public static void main(String[] args) {
        Task01 t=new Task01();
        t.findLargest(25,4);
    }
}
