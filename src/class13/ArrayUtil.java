package class13;

public class ArrayUtil {


    void checkingElementArray(int array[], int num) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("The number is present in the array");
                break;
            }else{
                System.out.println("The number is not present in the array");
            }
        }
    }


}