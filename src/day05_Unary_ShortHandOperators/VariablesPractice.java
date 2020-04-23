package day05_Unary_ShortHandOperators;

public class VariablesPractice {

    public static void main(String[] args) {

        // whole number: byte, short, int, long
        // decimals num: float, double

        int a1 = 100;
        float f1 = (long)  a1;
            // f1 = 100L;
            // f1 = 100.0;
        System.out.println(f1);

        long L1 = (long) f1;
            //l1 = 100
        System.out.println(L1);



        // Local Variable

        String name;

        // System.out.println(name);  // local variables must initialized before use it

        name = "CyberTek";   // in Java first come first serve
        System.out.println(name);

    }
}
