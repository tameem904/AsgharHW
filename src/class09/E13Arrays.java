package class09;

public class E13Arrays {
    public static void main(String[] args) {
        int []numbers={10,20,50,40,30};
        int largest=0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest ){
                largest=numbers[i];}}
        System.out.println(largest);

    }
}
