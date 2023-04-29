package class14;

public class ArrayManipulator {

    int sumArr(int[]arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        ArrayManipulator obj=new ArrayManipulator();
        int []array={10,20,30};
        int result = obj.sumArr(array);
        System.out.println(result);

    }
}
