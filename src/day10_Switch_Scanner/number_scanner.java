package day10_Switch_Scanner;

import java.util.Scanner;

public class number_scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // object of scanner

        System.out.println("Enter your first number: ");
            int num1 = scan.nextInt();
        System.out.println("Enter your Second number: ");
            int num2 = scan.nextInt();
        System.out.println("Enter your third number: ");
            int num3 = scan.nextInt();

        int max = (num1>=num2 && num1>=num3)? num1 : (num2>=num1 && num2>=num3)? num2 : num3;
        int min = (num1<=num2 && num1<=num3)? num1 : (num2<=num1 && num2<=num3)? num2 : num3;
        System.out.println("Maximum number is: "+max);
        System.out.println("Mnimum number is: "+min);

    }

}
