
/* Write a java program to input any two numbers and ask user to enter their symbol (+,-,/,*) find addition,Subtraction,multiplication and division according to their symbol (using if else)*/

import java.util.Scanner;

public class Programme10 {
    String s;
    static int a, b, c;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the Second number :");
        int b = sc.nextInt();
        System.out.print("Enter the Symbol :");
        String s = sc.next();

        m1(s, a, b);
    }
    public static void m1(String s, int a, int b) {

        if (s.equals("+")) {
            c = a + b;
            System.out.println("Addition:  " + c);
        } else if (s.equals("-")) {
            c = a - b;
            System.out.println("Subtraction " +c);
        } else if (s.equals("*")) {
            c = a * b;
            System.out.println("multiplication " +c);
        } else if (s.equals("/ ")) {
            c = a / b;
            System.out.println("division " +c);

        } else

            System.out.println("Invalid entry");

    }
}










