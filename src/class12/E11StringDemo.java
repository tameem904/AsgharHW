package class12;

public class E11StringDemo {

    public static void main(String[] args) {

        String name="LEANDRO";
         char target='R';
        int count=0;

        for(int i=0;i<name.length();i++){

            if(name.charAt(i)==target){
                count++;
            }

        } System.out.println(count);
    }
}
