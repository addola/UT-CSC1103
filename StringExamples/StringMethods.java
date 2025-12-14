import java.util.Scanner;
import java.io.*;

public class StringMethods {
    public static void main(String[] args) throws IOException
    {
        String name1, name2, name3;
        int age1, age2;
        Scanner keyboard = new Scanner(System.in);

        //BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        //a = Integer.parseInt (in.readLine());
        
        System.out.println ("Enter a name: ");
        name1 = keyboard.nextLine();

        System.out.println("Enter the age for " + name1 + " : " );
        age1 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println ("Enter another name: ");
        name2 = keyboard.nextLine();

        
        System.out.println("Enter the age for " + name2 + " : " );
        age2 = keyboard.nextInt();

        System.out.println("The fight is between: " + name1 + " and " + name2);

        System.out.println("The age difference is: " + (Math.abs(age1-age2)) );
        
        System.out.println ("Name '" + name1 + "' has a length of " + name1.length() );
        
        System.out.println ("Name '" + name2 + "' has a length of " + name2.length() );

        String password1 = "" + name1.charAt(0) + name1.charAt(name1.length()-1) + age1;

        System.out.println ("Default Password for " + name1 + " is '" + password1 + "'");

        
        System.out.println ("To Lower Example '" + name1.toLowerCase() +"'");
        System.out.println ("To Upper Example '" + name2.toUpperCase() +"'");
        
        name1 = name1.toLowerCase();
        name2 = name2.toUpperCase();

        System.out.println ("Name1 is '" + name1 +"'");
        System.out.println ("Name2 is '" + name2 +"'");

    }
}
