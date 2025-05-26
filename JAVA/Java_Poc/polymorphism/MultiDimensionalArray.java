package javaconcepts.polymorphism;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][]  multiDimensionalArray = {{12,13,144},{21,31,411,511},{23,33,44}};
        System.out.println(multiDimensionalArray[2][2]);
        for (int array=0;array< multiDimensionalArray.length;array++){
            for (int second=0;second<multiDimensionalArray[array].length;second++){
                System.out.print(multiDimensionalArray[array][second] + "\t");
            }
            System.out.println();
        }



    }
}
