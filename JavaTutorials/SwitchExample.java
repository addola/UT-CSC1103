public class SwitchExample
{
    public static void main (String[] args)
    {
        System.out.println("Enter number from 1-5");
        int dayIndex = new java.util.Scanner(System.in).nextInt();
        String dayName = "Sunday";
        switch (dayIndex)
        {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            default:
                dayName = "Undefined Name!";
        }

        System.out.println ("Day name is: " + dayName);
    }
}