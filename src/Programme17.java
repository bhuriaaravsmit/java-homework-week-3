/*Write a Java programme to sort a numeric array and a string array*/
import java.util.Arrays;
public class Programme17 {

String array;

    public static void main(String[] args) {
        int[] my_array1={80,25,70,25,23 };
        String[] my_array2={"Java" ,"Python","PHP","c++", "C programming","SQL" };
        System.out.println("original numeric array :"  + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array :" +Arrays.toString(my_array1) );

        System.out.println("Original String array : "+Arrays.toString(my_array2) );
        Arrays.sort(my_array2);
        System.out.println("Sorted String array : "+Arrays.toString(my_array2) );



    }




}
