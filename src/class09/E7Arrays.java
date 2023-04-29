package class09;

public class E7Arrays {
    public static void main(String[] args) {

        boolean j[]={true,false,true,false,false,true};
        int count=0;
        for (int i = 0; i <j.length ; i++) {
            if(j[i]==false){
                count++;

            }

        }System.out.println(count);
    }
}
