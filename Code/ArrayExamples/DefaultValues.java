/**
 * In this example, we show the default values for array elements when not initialized!.
 */
public class DefaultValues {
    public static void main(String[] args) {
        int x;
        //System.out.println(x); // Problem!! x was never initialized.

        String someName = null;

        double [] realNumbers = new double [5];

        int[] numbers = new int[10];

        for (int i=0; i<numbers.length; i++)
            System.out.println("At position "+i+" : " + numbers[i]);


        char[] letters = new char[10];

        for (int i=0; i<letters.length; i++)
            System.out.println("At position "+i+" : '" + letters[i]+ "'");


        System.out.println("What about array of Strings?");
        String[] names = new String[10];
        for (int i=0; i<names.length; i++)
            System.out.println("At position "+i+" : " + names[i]);


        System.out.println("Default values in an array of double");
        for (int i=0; i<realNumbers.length; i++)
        {
            System.out.print(realNumbers[i] + " ");
        }

        System.out.println();
        System.out.println("Size of character in bits: " + Character.SIZE);
        System.out.println("Size of double in bits: " + Double.SIZE);


    }
}
