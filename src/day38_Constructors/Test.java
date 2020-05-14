package day38_Constructors;

public class Test {

    public Test(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {

        System.out.println("Main method");
        new Test();   // instance, constructor
        // new Test();   // instance, constructor

    }


    static {
        System.out.println("Static block");  // static block execute at the first and only for one time
    }



}
