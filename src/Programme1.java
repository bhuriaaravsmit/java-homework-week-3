
import java.util.Scanner;/*Write a java programme that tells us that Input number is odd or even? use ternary operator?:*/

public class Programme1 {

    public static void main(String[] args) {//Main method

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number : ");
          int  num =s.nextInt();
        Programme1.evenOdd(num);

    }

    public static void evenOdd(int num) {

        String  result= (num%2==0)? "Even" :"odd";//ternary operator
        System.out.println(" Number is : "  +result);

    }
    }