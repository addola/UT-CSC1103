import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Enter an integer: ");
        int key = sc.nextInt();
        int current = 2;
        boolean isPrime = true;

        while (current < key/2)
        {
            if (key % current == 0)
            {
                System.out.println (key + " is NOT a prime number. It is divisible by " + current);
                isPrime = false;
                break;
            }
            current++;
        }
        //I can do it here!
        if (isPrime)
            System.out.println (key + " is a prime number");
    }
}
