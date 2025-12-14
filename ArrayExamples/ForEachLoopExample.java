import java.util.Random;

public class ForEachLoopExample {
    public static void main (String[] args)
    {
        int[] intNumbers = new int[10];

        Random rnd = new Random();
        
        for (int i=0; i<intNumbers.length; i++)
        {
            intNumbers[i] = rnd.nextInt(25);
        }
        double sum = 0;
        for (int element : intNumbers)
        {
            sum += element;
           System.out.println(element);
        }
        System.out.println("Sum is: " + sum);

        String[] fighterNames = {"Ken", "Ryu", "E. Honda", "Cammy", "Chun Lee", "Barlog", "Znageif", "Sakura"};

        for (String name : fighterNames)
            System.out.println(name);

        
        //fighterNames.forEach(color -> System.out.println(color));
        //fighterNames.forEach(System.out::println);    
    }
}
