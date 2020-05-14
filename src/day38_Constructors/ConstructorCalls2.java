package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
        // System.out.println("Hello");
        this(); // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
        this(10);   // default , & int argument
        // this();
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        // ConstructorCalls2 obj = new ConstructorCalls2();   // printing Default constructor
        // ConstructorCalls2 obj = new ConstructorCalls2(10);  // both (default , & int argument)
        ConstructorCalls2 obj = new ConstructorCalls2("Hello"); // default, int argument, & String argument
    }



    public void method1(){
        // ConstructorCalls2;
    }

    {

    }





}
