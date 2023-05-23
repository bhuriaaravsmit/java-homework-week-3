/*Write a java programme that tells us input value is a number or an alphabet or symbol*/

import java.util.Scanner;

public class Programme12 {

    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value : ");
        ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        {
            System.out.println("The value enter is Alphabet " + ch);

        }
            else if (ch >= '0' && ch <= '9')
        {
            System.out.println("The value enter is Number " + ch);
        }
            else{
            System.out.println("The value enter is Symbol " + ch);

        }
    }
}