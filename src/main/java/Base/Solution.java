package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 19
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your current body weight?");
        double weight = userInput();

        System.out.println("What is your current height?");
        double height = userInput();

    }

    private static double userInput(){

        double userInput = in.nextInt();

        return userInput;

    }
}
