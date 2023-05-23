import java.util.Scanner;
/*write a java programme to input a year like (2007) and find out if its is leap year or not?*/
public class Programme2 {


    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter any Year :");
        int a = y.nextInt();
        Programme2.leapYear(a);

    }

    public static void leapYear(int a) {
        if (a % 100 == 0 && a % 400 == 0 || a % 100 != 0 && a % 4 == 0) {
            System.out.println("The Year is Leap year");
        } else {
            System.out.println("The Year is not leap year");
        }


    }
}