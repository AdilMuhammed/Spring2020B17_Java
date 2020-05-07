package day35_Static;

public class staticMethods {

    int a = 100;
    static int b = 200;

    public static void main(String[] args) {

        // System.out.println(a);   // static only accept static

        staticMethods obj = new staticMethods();

        System.out.println(obj.a);

        System.out.println("=============================================");


        System.out.println(b);
        System.out.println(staticMethods.b);    // prefer way
        System.out.println(obj.b);  // static prefers to be called through class name



    }



    public void method(){
        System.out.println(a);
        System.out.println(b);
    }




}
