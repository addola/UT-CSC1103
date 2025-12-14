public class NPrintExample {
    
    public static void nPrintln(String message, int times)
    {
        for (int i=0; i<times; i++)
        {
            System.out.println (message);
        }
    }
    public static void nPrintln(int times, String message)
    {
        nPrintln (message, times);
    }
    
    public static void main(String [] args)
    {
        nPrintln("I love you!", 22);

        nPrintln (8, "Can you fix me?");

    }
}
