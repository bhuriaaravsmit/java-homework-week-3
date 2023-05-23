/* write a java programme which input any alphabet from "A" to "F" and print their city name accordingly using if else elseif statement*/


import java.util.Scanner;

public class Programme8 {


    public static void main(String[] args) {

        String alpha;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet :");

        alpha = sc.nextLine();
m1(alpha);

    }



    public static void m1(String alpha) {

        if (alpha.equals("A")) {
            System.out.println("City name :Aberdeen");
        } else if (alpha.equals("B")) {

            System.out.println("City name  :Bradford");
        } else if (alpha.equals("C")) {

            System.out.println("City name: Cambridge");
        } else if (alpha.equals("D ")) {

            System.out.println("City name :Derbyshire");

        } else if (alpha.equals("E")) {

            System.out.println("City name :Edinburgh");
        } else if (alpha.equals("F")) {
            System.out.println("City name : Filey");
        } else {

            System.out.println("Invalid entry");

        }
    }

}




