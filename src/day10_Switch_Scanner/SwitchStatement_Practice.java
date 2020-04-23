package day10_Switch_Scanner;

public class SwitchStatement_Practice {

    public static void main(String[] args) {

        char ch = 'a';

        switch (ch){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("Invalid");
        }

        // Second way for solution
        String result = "";
        switch (ch){
            case 'A':
              result = "A";
                break;
            case 'B':
                result = "B";
                break;
            case 'C':
                result = "C";
                break;
            case 'D':
                result = "D";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result);



    }

}
