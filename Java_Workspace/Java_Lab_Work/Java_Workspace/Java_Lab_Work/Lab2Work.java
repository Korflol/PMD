package Java_Lab_Work;
import java.util.Scanner;

public class Lab2Work {

    public static void main(String[] args) {
        
        Scanner myIn = new Scanner(System.in);
        /* String gender;  
        
        System.out.println("What is your gender?");
        gender = myIn.nextLine();

        if(gender != "M")  
        {
            System.out.println("Pension at 60");
        }

        byte age;

        System.out.println("What is your age?");
        age = myIn.nextByte();

        if(age <=1)
        {
            System.out.println("You must pay half fare.");
        }
        else
        {
            System.out.println("You must pay full fare.");
        } */


        //byte age;
        String status;

        //System.out.println("What is your age?");
        ///age = myIn.nextByte();
        

        /* if((age >=18) && (age <=30))
        {
            System.out.println("You can go on holiday with 18-30");
        }
        else
        {
            System.out.println("You can not go on holiday you are too young or old.");
        } */

        System.out.println("Are you married?");
        status = myIn.nextLine(); 

        if(status == "y")
        {
            System.out.println("You can go a single holiday");
        }
        else 
        {
            System.out.println("You must go a family holiday.");

        }
        myIn.close();
    }
}
