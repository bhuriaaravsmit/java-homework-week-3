/* write a java programme which input any alphabet from "A" to "F" and print their city name accordingly using Switch statement*/


import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        String alpha;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet :");

        alpha = sc.nextLine();
        m1(alpha);
    }
public static void m1(String alpha) {
            switch (alpha) {
                case "A":
                    System.out.print("City name : Aberdeen");
                    break;
                case "B":
                    System.out.print("City name :Bradford");
                    break;
                case "C":
                    System.out.print("City name :Cambridge");
                    break;
                case "D":
                    System.out.print("City name :Derbyshire");
                    break;
                case "E":
                    System.out.print("City name :Edinburgh");
                    break;
                case "F":
                    System.out.print("City name :Filey");
                    break;


                default:
                    System.out.println("Invalid entry");
            }

        }
    }






