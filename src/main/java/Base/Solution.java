package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 19
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("What is your current body weight? ");
        double weight = userInput();

        System.out.print("What is your current height? (in inches) ");
        double height = userInput();

        double BMI = ( weight / ( height * height) ) * 703;

        System.out.println("Your BMI is "+String.format("%.2f",BMI));

        if( BMI < 18.5 ){

            System.out.println("You are underweight, you need to see a doctor.");

        }

        else if( BMI > 25 ){

            System.out.println("You are overweight, you need to see a doctor.");

        }

        else if ( BMI > 18.5 && BMI <25){

            System.out.println("You are within the ideal weight range.");

        }

    }

    private static double userInput(){

        double userInput = in.nextInt();

        return userInput;

    }
}
