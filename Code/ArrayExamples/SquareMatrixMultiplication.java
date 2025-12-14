public class SquareMatrixMultiplication {

    public static void PrintMatrix (int [][] M)
    {
        for (int i=0; i<M.length; i++)
        {
            for (int j=0; j<M[i].length; j++)
            {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][]  MatrixMultiplication(int [][] A, int [][] B)
    {

        boolean possible = (A[0].length == B.length);

        if (!possible)
            return null;

        int result[][] = new int [A.length][B[0].length];

        for (int i=0; i<result.length; i++)
        {
            for (int j=0; j<result[i].length; j++)
            {
               result [i][j] = 0;
                for (int k=0; k<A[0].length; k++)
                {
                    int product = A[i][k] * B[k][j];
                    result [i][j] += product;
                }
                
            }
        }
        return result;

    }

    public static void main(String [] args)
    {
        int A[][] = {
            {3,9,2},
            {4,6,7},
            {2,8,11}
        };

        int B[][] = {
            {8,1,3},
            {2,9,5},
            {11,1,3}
        };

        int I[][] = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        System.out.println("Matrix A: ");
        PrintMatrix(A);
        
        System.out.println("Matrix B: ");
        PrintMatrix(B);

        System.out.println("Matrix I: ");
        PrintMatrix(I);
        
        int [][] C = MatrixMultiplication(A, B); 
        System.out.println ("Matrix A * B:");
        PrintMatrix(C);

    }
}
