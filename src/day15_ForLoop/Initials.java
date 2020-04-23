package day15_ForLoop;

import java.util.Scanner;

/*
write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

 */
public class Initials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lasName =scan.next();


        String initials2 = firstName.substring(0,1) + lasName.substring(0,1);
            initials2 = initials2.toUpperCase();


        String initials = "" + firstName.charAt(0) + lasName.charAt(0); // returns string
        initials = initials.toUpperCase();

        System.out.println(initials);
        System.out.println(initials2);

    }
}
