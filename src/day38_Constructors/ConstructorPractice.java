package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(10.0);
        System.out.println("A");
        // this(0.5);  // it needs to be at the very first step
    }

    public ConstructorPractice(int a){
        this();
        // this(10.5);  // every constructor can call ONLY one constructor
        System.out.println("B");
    }

    public ConstructorPractice(double a){
        // this();  // can't call itself or any Constructor which consist it
        // this(5.5);
        System.out.println("C");
    }


    public static void main(String[] args) {
        new ConstructorPractice(10);
    }






}
