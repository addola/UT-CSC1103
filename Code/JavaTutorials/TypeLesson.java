import java.util.Scanner;

public class TypeLesson {
    public static void main(String [] args)
    {

        float height, weight;
        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter the height in meters");
        height = sc.nextFloat();
        System.out.println("Please enter the weight in kilograms");
        weight = sc.nextFloat();

        System.out.println ("Weight = " + weight + " Height = " + height);


        double bmi = weight /  Math.pow (height,2);

        System.out.println("Your BMI is: " + bmi);

        //if (bmi >= 30 || bmi < 18.5)
        //    System.out.println ("Your health is at risk with this BMI!");
        
        if (bmi>=30)
        {
            System.out.println("You are Obese! Diet and Excercise is important to lose weight");
        }
        else
        if (bmi<30 && bmi>=25)
        {
            System.out.println("You are Overweight! I recommend that you consider losing some weight");
        }
        else if (bmi<25 && bmi>=18.5)
        {
            System.out.println("You have an ideal weight! Keep healthy eating and sleeping habits!");
        }
        else
        {
            System.out.println ("You are underweight. Consider increasing your protein & calorie");
        }

        System.out.println("Thank you for using The BodyChecker 3000");
    }
}
