package day46_final_abstract;

public class final_Variables {

    final int InstanceVariable = 300;
    // final int InstanceVariable2;   // final instance variables need to initialized immediately.

    final static int staticVariable = 1000;

    // final static int getStaticVariable2;    // final static variables need to initialized immediately.

    public static void main(String[] args) {

        final double PI = 3.14;  // When we applied final to variable, we can't reinitialize it
        // PI = 3.15;

        final String gender = "Male";
        // gender = "Female";

        final int score;
        score = 100;
        // score = 200;
        System.out.println(score);

        System.out.println("=======================================");

        // this.InstanceVariable = 400;
        final_Variables obj = new final_Variables();
        // obj.InstanceVariable = 400;

        // staticVariable = 2000;


    }




}
