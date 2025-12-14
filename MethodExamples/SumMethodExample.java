public class SumMethodExample
{

    public static void myMethod(int times)
    {
       for (int i=0; i<times; i++)
       {
        System.out.println ("Adil is AWESOME!");
       }
    }

    public static int sumRange (int start, int end)
    {
        int sum = 0;
        if (start < end)
        {
            for (int i=start; i<=end; i++)
            {
                sum += i;
            }
            return sum;
        }
        else
        {
            for (int i=start; i>=end; i--)
                sum += i;
            
            return sum;
        }
    }


    public static void main()
    {
        int sum1 = sumRange (12, 7);

        System.out.println (sum1);
    }
}