/*write a java programme to print the numbers between 1 to 100 which can be divided and 3 and 5 separately */

public class Programme11 {

    public static void numbers(){
        int i;
        System.out.println("\n Number Divided by 3: ");

        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) System.out.print(i+ ",");

        }
        System.out.println("\n\n Number Divided by 5:");
        for (i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i+ ", ");

        }

        System.out.println();
    }
    public static void main(String args[])
    {

    numbers();
}
}