package day42_Inheritance;

class B{
    public B(int a){
        System.out.println("int");  // int
    }

    public B(double a){
        System.out.println("double");  // double
    }

    public B(long a){
        this(2.5);  // double
        System.out.println("long");  // long
    }

}

public class InheritanceReview extends B {

    public InheritanceReview(String a){
        super(1l);  // double  long
        System.out.println("String");  // String
    }


    public static void main(String[] args) {
        InheritanceReview obj = new InheritanceReview("Hello");
    }



}
