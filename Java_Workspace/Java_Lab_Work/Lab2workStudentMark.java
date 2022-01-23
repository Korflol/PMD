import java.util.Scanner;

public class Lab2workStudentMark 
{
    public static void main(String[] args) 
    {
        Scanner myIn = new Scanner(System.in);
        byte mark;

        System.out.println("Please enter your mark: ");
        mark = myIn.nextByte();

        if (mark >= 70)
        {
            System.out.println("Top grade: ");
            System.out.println("you have an A");
        }
        else if ((mark >=60) && (mark <=70))
        {
            System.out.println("Very good grade: ");
            System.out.println("You have a B");
        }
        else if ((mark >=50) && (mark <=60))
        {
            System.out.println("A good grade: ");
            System.out.println("passed with a B2");
        }
        else if((mark >=40) && (mark <=50))
        {
            System.out.println("A low grade: ");
            System.out.println("but passed with a C");
        }
        else
        {
            System.out.println("You have failed ");
        }


    }





}
