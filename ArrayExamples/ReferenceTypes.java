public class ReferenceTypes {
    
    public static void someFunction(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i]*2;
        }
    }

    public static void printArray(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String [] args)
    {
        int example[] = {8,3,4,6,1,3,8,1};

        printArray(example);

        someFunction(example);
        System.out.println("After some function: ");
        printArray(example);
    }


}
