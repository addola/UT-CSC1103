import java.util.*;

public class FirstArray {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int array_size = 5;

        int[] numbers = new int [array_size];
        numbers [56] = 9;
        for (int i=0; i<numbers.length; i++)
        {
            System.out.println("Enter the value at position " + i + " :");
            numbers [i] = keyboard.nextInt();
        }
        
        double sum = 0;
        for (int i=0; i<numbers.length; i++)
        {
            sum +=numbers[i];
        }
        System.out.println ("Your array is: " + Arrays.toString(numbers));
        
        System.out.println("Sum is: " + sum);

        keyboard.close();

    }
}
