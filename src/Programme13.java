/*Write a Java programme which input any number 1 to 7and it print the Days name Monday ,Tuesday Sunday of the week accordingly by using switch.Note:if number i out selection Print message "Week contains 1 to 7 days".*/

import java.util.Scanner;

public class Programme13 {

    public static void main(String[] args) {
        int day, a;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number :");
        a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Week contains 1 to 7 days");
        }


    }
}


