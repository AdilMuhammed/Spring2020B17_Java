package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class List_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();   // size: 0
                                        // add five elements ===>  size: 5
                                        // remove two elements ===> size:3

        scores.add(10);   // Autoboxing         size: 1
        scores.add(20);   // Autoboxing         size: 2
        scores.add(30);   // Autoboxing         size: 3

        System.out.println(scores);

        Integer a1 = scores.get(2);   // none
        int a2 = scores.get(2);     //unboxing
        double a3 = scores.get(2);   //unboxing

        System.out.println(a3);

        //  System.out.println( scores.get(100) ); //index out of bound

        /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers");
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i=0; i < 5; i++ ) {
            int n = scan.nextInt();
            list.add(n);
        }
        System.out.println(list);

        Integer max = Integer.MIN_VALUE;
        for (int k=0; k<5; k++){
            if (list.get(k)>max){
                max = list.get(k);
            }
        }
        System.out.println(max);


    }


}
