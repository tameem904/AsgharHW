package e1;

public class E62DArrays {

    public static void main(String[] args) {

        String[][] names2DArray = {
                {"Sarah", "Atem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        for (String[] name1DArr : names2DArray) {
            for (String name : name1DArr){
                System.out.println(name);
            }
        }

    }
}
            /*for (int i = 0; i < names.length; i++) {
        for (int j = 0; j < names[i].length ; j++) {
        System.out.println(names[i][j]);*/
