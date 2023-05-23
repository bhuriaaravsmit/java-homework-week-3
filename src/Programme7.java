import java.util.Scanner;
/*write a java programme input sales id,seller's name ,sales amount and salary basic and then find this sales*/
public class Programme7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sales id : ");
        int salesId = sc.nextInt();
        System.out.print("Enter seller's name  :");
        String name = sc.next();
        System.out.print("Enter Sales amount :");
        int salesAmount = sc.nextInt();
        System.out.print("Enter basic salary: ");
        int salary = sc.nextInt();
        double comm=  commission(salesAmount);
         System.out.println("Commission  " +comm );
    }

    public static double commission(int salesAmount) {
        double commission;


        if (salesAmount >= 50000) {
            commission = salesAmount * 35 / 100;

        } else if (salesAmount >= 30000 && salesAmount < 50000) {

            commission = salesAmount * 20 / 100;

        } else if (salesAmount >= 20000 && salesAmount < 30000) {
            commission = salesAmount * 10 / 100;
        } else if (salesAmount >= 10000 && salesAmount < 20000) {
            commission = salesAmount * 5 / 100;
        } else {
            commission = salesAmount * 2 / 100;
        }
        return commission;
    }
}