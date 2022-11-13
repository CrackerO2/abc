import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Test
{
     static int numClasses = 0;
     static int numWClasses = 0;
     static double sum = 0;

    
    public static void main(String[] args)
    {
        System.out.println(askForGrade());

    }

    public static double askForGrade()
    {

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many classes do you take?");
        numClasses = input.nextInt();

        System.out.println("How many weighted classes?");
        numWClasses = input.nextInt();


        for (int i = 0; i < numClasses - numWClasses; i++)
        {
            System.out.println("Enter your grade for non advance classes (0-100): ");
            int grade = input.nextInt();
            sum += gradeToGPA(grade, false);

        }

        for (int i = 0; i < numWClasses; i++)
        {
            System.out.println("Enter your grade for  advance classes (0-100): ");
            int grade = input.nextInt();
            sum += gradeToGPA(grade, true);

        }

        return sum/ numClasses;
    }

    public static double gradeToGPA(int grade, boolean x)
    {
        double weight = 0;
        if (x)
        {
            weight = 4.8;
        }
        else{
            weight = 4.3;
        }

        if (grade >= 97)
        {
            return weight;
        }
        else if (grade >= 93)
        {
            return weight - .3;

        }
        else if (grade >= 90)
        {
            return weight - .6;
        }
        else if (grade >=87)
        {
            return weight - 1;
        }
        else if (grade >= 83)
        {
            return weight - 1.3;
        }
        else if (grade >= 80)
        {
            return weight - 1.6;
        }
        else if (grade >= 77)
        {
            return weight - 2;
        }
        else if (grade >= 73)
        {
            return weight - 2.3;
        }
        else if (grade >= 70)
        {
            return weight - 2.6;
        }
        else if (grade >= 67)
        {
            return weight - 3;
        }
        else if (grade >= 65)
        {
            return weight - 3.3;
        }
        else
        {
            return 0;
        }
    }
}