import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        Scanner keyboard = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter a value (0 to exit): ");
            value = keyboard.nextInt();
            if (value %3 == 0) {
                System.out.println(value + " is divisible by 3.");
            }
            else
            {
                System.out.println(value + " is not divisible by 3.");
            }
        } while (value!=0);

        keyboard.close();
    }
}
