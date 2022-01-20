import java.util.Scanner;

public class Lab2work2 {

    public static void main(String[] args) 
    {
      int age;
      String status;
      Scanner myIn = new Scanner(System.in);
    
        System.out.println("What is your age?");
        age = myIn.nextInt();
        System.out.println("Are you married?");
        status = myIn.nextLine();

        if(((age >=18) || (age <=30)) && (status == "y")) 
        {
            System.out.println("You can go on the 18-30.");
        }
        else
        {
            System.out.println("Sorry you can not go on the holiday for 18-30 and must go with family.");
        }

    }
}
