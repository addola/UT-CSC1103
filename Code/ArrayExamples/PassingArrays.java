public class PassingArrays
{
    public static void main(String[] args) {
        int [] data = new int[10];

        for (int i=0; i<data.length; i++)
        {
            data[i] = i;
        }
        System.out.println(data.hashCode());
        printArray(data);
        myArrayFunction(data);
        printArray(data);
    }

    public static void myArrayFunction(int [] param)
    {
        System.out.println(param.hashCode());
        for (int i=0; i<param.length; i++)
        {
            param[i] = param[i]*8;
        }
    }

    public static void printArray(int [] param)
    {
        for (int i=0; i<param.length; i++)
        {
            System.out.println(i + " : " + param[i]);
        }
    }
}