package day05_Unary_ShortHandOperators;

public class LeapYear {
     /*
         1. create a class called LeapYear,
         and write a program that can identify if the given is Leap Year,
         print true if it's leap year, otherwise print false
        Ex:
            year = 2020

        output:
            2020 is leap year: true
         */

    public static void main(String[] args) {

        short year = 2020;
        // LeapYear:year % 4 = 0
        // if returns true ===> LeapYear, if it returns false ===> not LeapYear

       boolean LeapYear = year % 4 == 0;  // if the year can divided by 4 without any reminder, then its Leap Year

       // System.out.println(year+ " is leap year: " +LeapYear);

        String result = year+ " is leap year: " +LeapYear;
        System.out.println(result);


    }

}
