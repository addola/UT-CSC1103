public class ForLoopExample {
    public static void main(String[] args) {
        
        
            for(int i=0;  i<=100; i++)
            {
                if (i % 5 == 0 && i % 7 == 0)
                {
                    System.out.println(i);
                }
            }

            for (int i=0, j=10;    i<=10 && j>=0;     i++,j=j+3)
            {
                System.out.println(i + " * " + j + " = " + (i*j));
            }

    }
}
