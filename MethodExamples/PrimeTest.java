public class PrimeTest {
    
    static int globalValue = 199;

    public static boolean isPrime (int value)
    {
        for (int i=2; i<=value/2; i++)
        {
            if (value%i==0)
                return false;
        }
        System.out.println ("Global is: " + globalValue);

        return true;
    }
    
    public static void main(String[] args)
    {
        for (int i=2; i<50; i++)
        {
            if (isPrime (i))
            {
                System.out.println(i + " is Prime!");
            }
        }
        System.out.println ("Global is: " + globalValue);
    }
}
