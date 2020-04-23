package day23_Methods;

public class Method_Practice2 {
/*
1. write a method that can print all odd number between 1 ~ 100
2. write a method that can print all even number between 1 ~ 100
 */
    public static void main(String[] args) {

        printOddNumber();
        System.out.println();
        printEvenNumber();


    }

    public static void printOddNumber(){
        for (int i=1; i<=100; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }


    public static void printEvenNumber(){
        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }



}
