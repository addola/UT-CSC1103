public class AmbigiousExample {
    
    public static void multiply (int x, double y)
    {
        System.out.println (x*y);
    }
    
    
    public static void multiply (double x, int y)
    {
        System.out.println (x*y);
    }
    
    
    public static void main(String [] args)
    {
        // multiply(3, 10); // Ambigious call!
    }
}
