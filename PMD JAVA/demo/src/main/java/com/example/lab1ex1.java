package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class lab1ex1 
{
    public static void main( String[] args )
    {
        //scanner initialisation - I/O system
        Scanner myIn = new Scanner(System.in);

        System.out.println("How many students are in your university class?");
        int NumStudents = myIn.nextInt();
        System.out.println("Wow! so there are: " + NumStudents);


        // car variables and string concantenation
        String make;
        String colour;
        int year;
        System.out.println("What is the make of your car?");
        make = myIn.nextLine();
        System.out.println("So your car is a " + make +".");
        System.out.println("What is the colour of you car?");
        colour = myIn.nextLine();
        System.out.println("And the colour is " + colour + ".");
        System.out.println("What is the year of your car?");
        year = myIn.nextInt();
        System.out.println(("Finally, it was registered in " + year + "."));
        System.out.println("So your car is a " + make + " made in " + year + " and is the colour " + colour + "."); 


        //Simple Addition with user inputs.
        int first;
        int second;
        int result;

        System.out.println("Please enter your first number: ");
        first = myIn.nextInt();
        System.out.println("Please enter your second number: ");
        second = myIn.nextInt();

        result = first + second;
        System.out.println("The result of the addition is ");
        System.out.println(result);


        //closes the scanner class. Stops memory leak and resource loss
        myIn.close();




    }
}

