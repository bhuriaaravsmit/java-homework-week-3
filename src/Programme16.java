/*Write the java programme to check if enter number is "Positive", "Negative "or "Zero"*/
import java.util.Scanner;

public class Programme16 {

    static int a,n;

    public static void main(String[] args) {


        System.out.println("Enter the number");
        Scanner n=new Scanner(System.in);
        a=n.nextInt();

        System.out.println("Number is: " +a);
        pnz();
    }

    public static void pnz() {

        if (a > 0) {
            System.out.println("Number is Positive");
        } else if (a < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
        }
    }