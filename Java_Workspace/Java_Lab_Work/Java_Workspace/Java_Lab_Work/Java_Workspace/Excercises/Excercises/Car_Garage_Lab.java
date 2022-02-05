package Excercises;

import java.util.Scanner;

public class Car_Garage_Lab
{
 public static void main(String[] args) 
 {
    Scanner myIn = new Scanner(System.in);
    // Car2 myCar = new Car2();
    // myCar.manufacturer = ("Porsche");
    // myCar.model = ("911-GT3");
    // myCar.year = 2022;
    // System.out.println("Manufacturer: " + myCar.manufacturer);
    // System.out.println("Model: " + myCar.model);
    // System.out.println("Year: " + myCar.year);

    Car2[]myGarage;
    myGarage = new Car2[5];
    myGarage[0] = new Car2();
    myGarage[0].manufacturer = "Porsche";
    System.out.println(myGarage[0].manufacturer);

    int i = 0;
    for(i = 0; i < 5; i++)
    {
        myGarage[i] = new Car2();
        System.out.println("Enter a car make");
        myGarage[i].manufacturer = myIn.nextLine();
        System.out.println("Enter a car model");
        myGarage[i].model = myIn.nextLine();
        System.out.println("Enter a car year");
        myGarage[i].year = myIn.nextInt();
        myIn.nextLine();
        System.out.println(i + 1);
    }
    for(i = 0; i<5; i++)
    {
        System.out.println(myGarage[i].manufacturer);
        System.out.println("");
        System.out.println(myGarage[i].model);
        System.out.println("");
        System.out.println(myGarage[i].year);
        System.out.println("");
    }



    
 }
}
