public class FirstLoopExample {
    public static void main(String[] args)
    {
        int end = 150;
        int start = 1;
        int current = start;
        int divisor = 15;
        while (current<=end)
        {
            if (current % divisor == 0)
            {
                System.out.println (current + " is divisible by " + divisor);
            }
            current++;
        }  
    }
}
