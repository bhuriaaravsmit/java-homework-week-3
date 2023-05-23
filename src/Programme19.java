/*write a java programme to calculate the average value of array elements*/

public class Programme19 {

    public static void main(String[] args) {

        int []numbers= new int[]{20,30,40,50,60};
        int sum=0;
        //calculate sum of array elements
        for (int i=0;i< numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average =sum/numbers.length;
        System.out.println("Average value of array element is " +average);

    }

}
