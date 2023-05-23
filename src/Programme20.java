/*write a java programme to test if any array contains a specific value*/

public class Programme20 {


    public static void main(String[] args) {
        int a[];
        int i;
        int[] array = {1, 2, 3, 4, 5};



       boolean arr=a1(array,1);
        System.out.println("array contains value : -" +arr);

    }

    public static boolean a1(int a[], int item) {

        for (int i = 0; i <= a.length; i++) {
            if (a[i] == item) {
                return true;
            }
        }
        return false;
    }
}