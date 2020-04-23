package day17_WhileLoops;

import java.util.Scanner;
/*
1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
*/
public class MaxAndMinNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int MaxNumber = -999999999; // any number the user provided will be greater than this number.
                                    //first user entered variaable will be initialized to MaxNumber.
        int MinNumber = 999999999;
        for (int i = 1; i < 6; i++) {   // i: 1, 2, 3, 4, 5
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > MaxNumber){   // to compare each user inputs, and assign the maximum number to MaxNumber
                MaxNumber = num;
            }

            if (num < MinNumber){
                MinNumber = num;
            }
        }

        System.out.println("Maximum number is: "+MaxNumber);
        System.out.println("Minimum number is: "+MinNumber);

    }
}
