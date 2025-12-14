import java.util.Arrays;
import java.util.Random;

public class FindMaxExample {
    
    public static int getMaxIndex (int [] numbers)
    {
        int maxIndex = 0;
        System.out.println("Starting by assuming that element @ 0 is the largest, which is " + numbers[maxIndex] + "\n");
        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]>numbers[maxIndex])
            {
                System.out.println("Element @ " + maxIndex + " which has the value of " + numbers[maxIndex] + " is no longer the largest element");   
                maxIndex = i;
                System.out.println("The new max is at " + maxIndex + " with a value of " + numbers[maxIndex] + "\n");

            }
        }
        return maxIndex;
    }
    
    public static void main(String [] args)
    {
        int[] intNumbers = new int[50];

        Random rnd = new Random();



        for (int i=0; i<intNumbers.length; i++)
        {
            intNumbers[i] = rnd.nextInt(100);
        }
        int index = getMaxIndex(intNumbers);

        System.out.println("My Array is: " + Arrays.toString(intNumbers));
        System.out.println("Maximum value is: " + intNumbers[index] + " at index " + index);
    }
}
