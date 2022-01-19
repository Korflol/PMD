package com.example;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

public class lab1ex2 {
    

    public static void main(String[] args) {
        
        Scanner myIn = new Scanner(System.in);


        //calculates the square of a number (area of a square)
        int length;
        int area;

        System.out.println("What is the length ");
        length = myIn.nextInt();
        area = length * length;
        System.out.println("The area of the square is: " + area);


        //calculates the average of 4 numbers
/*      int firstNum;
        int secondNum;
        int thirdNum;
        int fourthNum;
        int sum;
        int average;

        System.out.println("What is the first number");
        firstNum = myIn.nextInt();
        System.out.println("What is the second number");
        secondNum = myIn.nextInt();
        System.out.println("What is the third number");
        thirdNum = myIn.nextInt();
        System.out.println("What is the fourth number");
        fourthNum = myIn.nextInt();
        sum = firstNum + secondNum + thirdNum + fourthNum;
        //System.out.println(sum);
        average = (sum / 2);
        System.out.println("The average of the four numbers is: " + average); */


    }
}
