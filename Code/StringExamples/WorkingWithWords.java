import java.util.*;
public class WorkingWithWords
{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        int n1 = 19;
        double n2 = 2.3;
        float n3 = 9.2f;
        long n4 = 1431;
        double n5 = 348.0f;
        short s6 = 3276;
        short s7 = 10;

        char c1 = 259;
        char c2 = 'G';

        String name1 = "E. Honda";

        String someValue = "1234";

        System.out.println ("Your fighter is: " + name1);

        System.out.println ("Your value is: " + someValue);

        System.out.println (99+someValue);

        int int_katkoot;
        Integer int_kabeer = 88;
        Short short_kabeer = 9;
        //give examples on MAX_VALUE;
        System.out.println ("Max Value of Integer is: " + Integer.MAX_VALUE + "\t\tMin Value of Integer is: " + int_kabeer.MIN_VALUE);
        System.out.println ("Max Value of Short is: " + Short.MAX_VALUE + "\t\tMin Value of Short is: " + short_kabeer.MIN_VALUE);

        int convertedValue = Integer.parseInt(someValue) + 1;

        System.out.println ("Converted Value: " + convertedValue);



    }
}