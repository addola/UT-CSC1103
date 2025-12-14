public class ShortCircuit
{

    public static boolean getTrue()
    {
        System.out.println("Inside getTrue()");
        return true;
    }
    public static boolean getFalse()
    {
        System.out.println("Inside getFalse()");
        return false;
    }

    public static void main(String[] args) {
        
        //if (getTrue() | getFalse())
        if (getFalse() && getTrue())
        {
            System.out.println ("The condition is true");
        }
        else
            System.out.println("The condition is false");

    
        int n1 = 6; //0110
        int n2 = 8; //1000

        System.out.println(n1 | n2);
    
        }
}