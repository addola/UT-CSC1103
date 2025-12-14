import java.util.*;

public interface LoopFlags {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int value = keyboard.nextInt();
        int divisor = 2;

        boolean isPrime = true;

        while (divisor < value){
            if (value % divisor == 0){
                isPrime = false;
                break;
            }
            divisor++;
        }
        
        if (isPrime){
            System.out.println(value + " is a prime number.");
        } else {
            System.out.println(value + " is not a prime number.");
        }
    }
}
