package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="ksnfksnDSkJDSDJ1232344@#$%*&";
        System.out.println(str.replaceAll("[a-z]",""));
     // ^ is stand for not in replacing the letters in String method
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        // ^ mean:: don't replace lower case letters from a-z and numbers from 0-9
        // ! will not work in  replacing the letter here the symbol ^ will work for not operation
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Dn3]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));



    }
}
