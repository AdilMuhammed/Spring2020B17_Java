package day11_Scanner;

import java.util.Scanner;

public class NextLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();   // nextLine: accepts the "Enter"

        System.out.println("Your full name is: "+fullName);

        System.out.println("Enter your sentense: ");
        String sentense = input.nextLine();
        System.out.println("You entered: "+sentense);


    }

}
