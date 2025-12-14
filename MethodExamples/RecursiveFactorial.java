public interface RecursiveFactorial {
    
    
    public static int fact (int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * fact (n-1);
        }
    }
    
    
    public static void main(String [] args)
    {
        int value = fact (6);
        System.out.println (value);
    }
}
