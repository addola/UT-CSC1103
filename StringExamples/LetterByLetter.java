import java.util.Scanner;

public class LetterByLetter {
    public static void main(String[] abc)
    {
        Scanner keyboard = new Scanner(System.in);
        String line;
        System.out.println ("Enter your line: ");
        line = keyboard.nextLine().toUpperCase();

        for (int i=0; i<line.length(); i++)
        {
            //System.out.println(line.charAt(i));
            if (i<line.length()-1)
            {
                System.out.print (line.charAt(i) + "-");
            }
            else
                System.out.print (line.charAt(i));
            
        }
        System.out.println();
        keyboard.close();


    }
}
