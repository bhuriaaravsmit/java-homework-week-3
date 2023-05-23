/*write a java programme to input student name,toll no, and three subjects Math,Science and english marks(marks is between 0 to 100 and if it is out of range print error message "Invalid Input ., marks should between 0 to100*/
import java.util.Scanner;
public class Programme3 {


    public static void main(String[] args) {

        int  r,t,u,v;
        String s;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        s = n.nextLine();
        System.out.print("Enter rollno : " );
        r = n.nextInt();


        System.out.print("Enter marks: Maths : ");
        t=n.nextInt();
        System.out.print("Enter marks :Science : ");
        u=n.nextInt();
        System.out.print("Enter marks :English :");
        v=n.nextInt();

        if (t < 0 || u < 0 || v < 0 || t > 100 || u > 100 || v > 100) {
            System.out.print("Invalid Input , Marks should be between 0 and 100");
        }
      else{
            mSheet(t,u,v,s,r) ;
        }

    }

        public static void mSheet(int t,int u,int v, String s,int r) {
            {
 String result="";
                double sum = t+u+v;
                double percentage = sum/3;
                String grade="";
                if (percentage >= 80) {result ="Pass";
                   grade="A+";

                } else if (percentage < 80 && percentage >= 60)
                {result ="Pass";
                    grade="A";

                } else if (percentage < 60 && percentage >= 50) {result ="Pass";
                    grade="B";

                } else if (percentage < 50 && percentage >= 35) {result ="Pass";
                    grade="C";
                } else {
                    grade="Fail";
                }

                System.out.println("---------------------------------------------------------"  );
                System.out.println("|                                                        | ");
                System.out.println("|                   Mark Sheet                           | ");
                System.out.println("|                                                        | ");
                System.out.println("|--------------------------------------------------------");
                System.out.println("| Name                         :           " + s + "        |" );
                System.out.println("| Roll No                      :           " + r + "        |" );
                System.out.println("|--------------------------------------------------------");
                System.out.println("| Subjects                   :           Marks         |");
                System.out.println("|--------------------------------------------------------");
                System.out.println("| Maths                      :          "    + t     + "             |" );
                System.out.println("| Science                    :          "    + u     + "             |" );
                System.out.println("| English                    :          "    + v     + "             |" );
                System.out.println("|  Total                     :          "    +sum    + "          |" );
                System.out.println("|  Result                     :         "    +result +"           |" );
                System.out.println("|  Grade                     :          "    +grade  + "              |" );
                System.out.println("---------------------------------------------------------"  );
            }
        }

    }


















