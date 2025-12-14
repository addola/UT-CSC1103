public class CarriageReturn
{
    public static void main (String[] args) throws InterruptedException
    {
        int value = 0;

        for (int i=value; i<=100; i++)
        {
            System.out.print(i + " % Completed");
            System.out.print("\r");
            Thread.sleep(100);
        }
        System.out.println("\n\nDone!");
    }
}