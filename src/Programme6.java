
/*Write a java programme to input any number and find out if its odd or even*/

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int  num =s.nextInt();
        Programme1.evenOdd(num);

    }

    public static void evenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }




    }
}



