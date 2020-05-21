package day42_Inheritance;

class Test{

    public Test(int a){
        System.out.println("A");
    }

}


public class Constructor2 extends Test {

    public Constructor2(){
        super(15);  // A
        System.out.println("B");  // B
    }


    public static void main(String[] args) {

        // Test obj = new Test(10);

        Constructor2 obj2 = new Constructor2();  //  A B
    }


}
