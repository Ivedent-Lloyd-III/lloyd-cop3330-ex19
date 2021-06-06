package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 19
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        
        int weight = weightInput();
        int height = heightInput();


    }

    private static int weightInput() {

        System.out.println("What is your current body weight?");
        String weightInput = in.nextLine();


        for (;;) {

            for (char c : weightInput.toCharArray()) {

                aa:

                if (!Character.isAlphabetic(c)) {
                    break aa;
                }

                else{

                    int weight = Integer.parseInt(weightInput);

                    return weight;

                }
            }
        }

    }

    private static int heightInput() {

            System.out.println("What is your current height?");
            String heightInput = in.nextLine();

            aa:

            for (;;) {

                bb:
                for (char c : heightInput.toCharArray()) {
                    if (!Character.isAlphabetic(c)) {
                        break bb;
                    }
                    else{

                        break aa;

                    }
                }
            }

        int height = Integer.parseInt(heightInput);

            return height;

    }

}
