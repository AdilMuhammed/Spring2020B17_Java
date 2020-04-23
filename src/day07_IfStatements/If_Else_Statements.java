package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = 0;
        /*
        if(number >= 0){
            System.out.println(number+" is positive");
        }
        if(number < 0){
            System.out.println(number+" is negative");
        }

         */


        if(number >= 0){
            System.out.println(number+" is positive");
        } else {
            System.out.println(number+" is negative");
        }


        int n = 100;
        boolean evenNumber = n % 2 == 0;
        if(evenNumber){
            System.out.println(n+" is even number");
        }else {     // otherwise
            System.out.println(n+" is odd number");
        }


        int age = 30;
        boolean eligibleAge = age >= 21;
        if(eligibleAge){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home Kid");
        }


        boolean testedPositiveForCorona = true;
        if(testedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Do more coding");
        }


    }


}
