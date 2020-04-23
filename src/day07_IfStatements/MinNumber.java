package day07_IfStatements;

/*
write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */

public class MinNumber {

    public static void main(String[] args) {

        double a = 1000;
        double b = 200;
        double c = 400.5;

        boolean aMinimum = a < b && a < c;  // if a is less than b and c, then a is minimum
        boolean bMinimum = b < a && b < c;  // if b is less than a and c, then b is minimum
        boolean cMinimum = c < a && c < b;  // if c is less than a and b, then c is minimum

        if(aMinimum){
            System.out.println(a+" is the minimum number");
        }
        if(bMinimum){
            System.out.println(b+" is the minimum number");
        }
        if(cMinimum){
            System.out.println(c+" is the minimum number");
        }


    }

}
