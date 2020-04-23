package day20_ArraysContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        String[] months = {"Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};
            //              0        1       2       3       4       5       6

         /*
        String[] months2 = new String[12];
                months2[0] = "Jan";
               ...
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt(); // 18

        int attepmts = 1;

        while(num > 12 || num <= 0){

            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();  //12
            attepmts++;

            if(attepmts == 3 &&  (num > 12 || num <= 0) ){
                System.out.println("Invalid Entry, you already have 3 attepmts");
                System.exit(0);
            }

        }



        String result =  months[num-1];  // index number, index number starts from 0 ALWAYS

        System.out.println(result);


    }
}
