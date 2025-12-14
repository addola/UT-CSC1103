public class LoopExample
{
    public static void main(String[] args)
    {
        int i = 0;

        while (i<=100)
        {
            if (i % 5 == 0 && i % 7 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}