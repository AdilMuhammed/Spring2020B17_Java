package day13_StringClass;

import java.util.Scanner;
/*
        Assignment:
        write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */
public class StringManipulation_Practice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String firstInitial = fullName.substring(0,1).toUpperCase();
        String lastInitial = fullName.substring(fullName.indexOf(" ")+1, fullName.indexOf(" ")+2).toUpperCase();

        System.out.println("Your Initial is: "+firstInitial+lastInitial);

    }

}
