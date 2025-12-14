public class TwoDimensionalArray {

    public static void printTwoDimensionalArrayUsingFor(int [][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printTwoDimensionalArrayUsingForEach(int [][] values)
    {
        for (int[] row : values)
        {
            for (int v : row)
            {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args)
    { 
        //The variables "table" & "values" are arrays of integer arrays!
        int [][] table = new int [3][5];

        System.out.println(table.length);

        System.out.println(table[0].length);
        System.out.println(table[1].length);
        System.out.println(table[2].length);

        System.out.println("Using Initializer list: ");
        int [][] values = {
            {3,9,12,1,3},
            {8,2,15,7,6,19,21,32},
            {19,5,16}
        };
        System.out.println(values.length); // output? 3

        System.out.println(values[0].length); // output? 5
        System.out.println(values[1].length); // output? 5
        System.out.println(values[2].length); // output? 5

     
        System.out.println ("Values using For loop: ");
        printTwoDimensionalArrayUsingFor(values);
        System.out.println ("Values using Foreach loop: ");
        printTwoDimensionalArrayUsingForEach(values);
        



    }
}
