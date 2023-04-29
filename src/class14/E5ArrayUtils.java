package class14;

public class E5ArrayUtils {

    boolean contains(int arr[], int num) {
     boolean isFound=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) {
                isFound =true;


            }
        } return isFound;

    }
    public static void main(String[] args) {
        E5ArrayUtils utils=new E5ArrayUtils();
        int num=4;
        int arr[]={10,20,45};

        boolean result=utils.contains(arr,num);
        System.out.println(result);


    }

}

