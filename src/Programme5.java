
/*wap to input employee id,name,basic salary then find FRA,TA,DA ,PF and Gross salary
HRA= basic salary 10%
DA=Basic salary 8%
Ta= Basic salary = 9%
PF=Basic salary 20%
Gross salary =basic salary + HRA+ TA+ DA-PF
Print in the format*/

import java.util.Scanner;

public class Programme5 {


    public static void main(String[] args) {
   double hra=0, ta=0, da=0, pf=0,gs=0;

        Scanner s = new Scanner(System.in);
        String name;

        System.out.print("Enter employee ID : ");
        int a = s.nextInt();
        System.out.print("Enter Employee Name : ");
        name = s.next();
        System.out.println("Enter basic salary :");
        int c = s.nextInt();

        System.out.println(" ---------------------------------------------------------");
        System.out.println("|                 Salary Slip                             |");
        System.out.println("|                                                         |");
        System.out.println(" ----------------------------------------------------------");
        System.out.println("| Employee ID                  : " + a + "                      |");
        System.out.println("|Employee Name                 : " + name + "                      |");
        System.out.println(" ----------------------------------------------------------");
        System.out.println("|Basic Salary                : " + c + "                      |");
        System.out.println("|HRS 10%                     : " + getHRA(c) + "                    |");
        System.out.println("|TA 8%                       : " + getTA(c) + "                     |");
        System.out.println("|DA 9%                       : " + getDA(c) + "                     |");
        System.out.println("|PF-20 &                     : " + getPF(c) + "                     |");
        System.out.println(" -------------------------------------------------------------");
        System.out.println("|Gross Salary                : " + sal(c) + "                     |");
        System.out.println("|----------------------------------------------------------|");

        //  sal(a, name, c,hra,ta,da,pf);
    }

    public static double getHRA(int c){
        double hra = (0.1 * c);
        return hra;
    }


    public static double getTA(int c){
        double  ta = (0.09 * c);
        return ta;
    }

    public static double getDA(int c){
        double da = (0.08 * c);
        return da;
    }

    public static double getPF(int c){
        double  pf = (0.2 * c);
        return pf;
    }



    public static double sal(int c) {
       double hra = (0.1 * c);
        double ta = (0.09 * c);
        double   da = (0.08 * c);
        double pf = (0.2 * c);
        double gs = (c + hra + ta + da - pf);
        return gs;

    }

}

