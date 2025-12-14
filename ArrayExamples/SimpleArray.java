import java.util.Random;
import java.util.random.*;

public class SimpleArray {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int [] numbers = new int [5];
        double [] percentage = new double[5];

        for (int i=0; i<5; i++)
        {
            numbers [i] = rnd.nextInt(500);
        }

        for (int i=0; i<5; i++)
        {
            System.out.println(numbers[i]);
        }
        System.out.println ("Sum of the array: ");

        int sum = 0;
        for (int i=0; i<numbers.length; i++)
        {
            sum = sum + numbers [i];
        }
        System.out.println("Sum is: " + sum);

        for (int i=0; i<numbers.length; i++)
        {
            percentage[i] = 100.0 * numbers[i]/sum;
        }
        for (int i=0; i<percentage.length; i++)
        {
           System.out.println ("Store " + i +" % :" + Math.round(percentage[i]));
        }
        


    }
}
