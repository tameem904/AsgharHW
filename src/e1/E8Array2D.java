package e1;

public class E8Array2D {
    public static void main(String[] args) {
        boolean [][] arr2D={
                {true, false,true,true,false},
                {true,false,false,false,false}
        };
        int count=0;
        // with the help of loops count how many times we have true in above 2DArrays
        for(boolean []arr1D:arr2D){
            for(boolean arr:arr1D){
                if(arr==true){
                    count++;
                   }
            }
        }

    }
}
