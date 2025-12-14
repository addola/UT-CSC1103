import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        
        double[] realNumbers = new double[50];
        int[] intNumbers = new int[50];

        Random rnd = new Random();



        for (int i=0; i<realNumbers.length; i++)
        {
            realNumbers[i] = Math.random()*100.0;
            intNumbers[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(realNumbers));
        System.out.println("\n\n");    

        System.out.print("[");
        for (int i=0; i<intNumbers.length; i++)
        {
            if (i!=intNumbers.length-1)
                System.out.print(intNumbers[i] + ", ");
            else
            System.out.print(intNumbers[i]);
        }
        System.out.println("]");

    }
}
