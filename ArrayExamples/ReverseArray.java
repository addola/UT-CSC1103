import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] input)
    {
        int [] result = new int [input.length];

        for (int i=0, j=input.length-1; i<input.length      ; i++, j--)
        {
            result[i] = input[j];
        }

        return result;
    }

    public static int[] reverseArrayForEach(int[] input)
    {
        int [] result = new int [input.length];
        int j=input.length-1;
        for (int v : input)
        {
            result[j--] = v;
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6,7,8};

        int[] reversedResult = reverseArray(numbers);

        System.out.println ("Original Array: " + Arrays.toString(numbers));

        System.out.println ("Reversed Array: " + Arrays.toString(reversedResult));

        int[] doubleReverse = reverseArrayForEach(reversedResult);
        
        System.out.println ("Reverse of the reverse of the Array: " + Arrays.toString(doubleReverse));


    }
}
