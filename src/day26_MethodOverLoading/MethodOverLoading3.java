package day26_MethodOverLoading;

public class MethodOverLoading3 {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {

        sum(10, 20);
        sum(1.5, 2.5);
        sum(1,2);
        sum(1.5, 2.0);
        sum(25l,20l);
        sum(4f,6f);
        sum((int)10l,(int)5l);
    }


    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(double a, double b){
        System.out.println(a+b);
    }


}
