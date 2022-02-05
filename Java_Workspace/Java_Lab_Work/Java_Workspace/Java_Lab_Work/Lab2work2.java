package Java_Lab_Work;
import java.util.Scanner;

public class Lab2work2 {

    public static void main(String[] args) 
    {
      int age;
      String status;
      Scanner myIn = new Scanner(System.in);
    
        System.out.println("What is your age?");
        age = myIn.nextInt();
        myIn.nextLine();

        if ((age >= 18) && (age <= 30))
        {
            System.out.println("Are you married?");
            status = myIn.nextLine();
            if (status.equals("n"))
            {
                System.out.println("You can go on the holiday.");
            }
            else
            {
                if (status.equals("y"))
                {
                    System.out.println("You can not go on the holiday as you are married.");
                }
            }
        }
        else
        {
            System.out.println("You can not go on the holiday. You do not meet reqs.");
        }
        myIn.close();
    }
          
}







