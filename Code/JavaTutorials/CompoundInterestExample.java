public class CompoundInterestExample
{
    public static void main(String[] args) {
        double start = 100000;
        double interest = 0.05;
        int years = 100;

        double sum = start;
        for (int i=0; i<years; i++)
        {
            sum = sum + sum*interest;
        }
        System.out.println("Ending Balance: " + sum);
    }
}