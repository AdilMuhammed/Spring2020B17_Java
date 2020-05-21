package day43MethodOverriding;

class Test{
    public void method(){
        System.out.println("Baran");
    }
}

public class MethodOverriding extends Test {
    @Override   // for checking the method is overriding or not
    public void method(){
        System.out.println("Aran");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method();  // Baran

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method();   // Bran
    }




}
