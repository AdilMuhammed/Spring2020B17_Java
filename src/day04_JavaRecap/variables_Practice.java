package day04_JavaRecap;

public class variables_Practice {

    public static void main(String[] args) {

        // Data type variableName = Data;
        // byte num1 = 100.5; // Wrong co it only accepts whole number
        // byte num2  129; // Wrong coz the number is out of Byte range
        // double > float > long > int > short > byte
        byte num1 = 100;
        short s1 = num1; // we can assign the byte num to the short co it's smaller
        // byte num2 = s1; Wrong coz sort is greater
        // short s2 = 40000; Wrong coz 40000 is out f short range
        int num2 = s1;
        int num3 = 1000;
        // int public = 1000; Wrong coz the word "public" is one of Java reserved names
        long li = 99999999999l;
        float f1 = 100l;
        System.out.println(f1);

        float f2 = 100.5f;
        System.out.println(f2);

        double d1 = 15.5;
        double d2 = 10;    // 10.0
        double d3 = 100L;    // 100.0

        char ch1 = 'A';  //
        System.out.println(ch1);

        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 9800;
        System.out.println(ch3);

        int a1 = 'a';
        System.out.println(a1);

        int a2 = 'a'+'b';
        //       87 + 98 = 195
        System.out.println(a2);

        double dnum = 'a';
        System.out.println(dnum);

        char char1 = 'a';
        byte byte1 = 'a';   // cann't write as "byte byte1 = char1"

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(10 > 5+5);

         boolean result1 = 10 > 9;

        System.out.println(10 >= 10);    // true
        System.out.println(10 != 10);    // false

        System.out.println("Corona" == "Ebole");    // false
        System.out.println("Corona" != "Ebole");    // true

        // System.out.println("Nine" == 9);

        System.out.println('a' != 97);
                  //       97 != 97 ===> false

        System.out.println(!true);  // false
        System.out.println(!false);  //true

        boolean r1 = true != !false;   // true

        boolean r2 = !(9 > 10) != !(10 > 9);

        System.out.println(r2);
        System.out.println( !(9 > 10) != !(10 > 9));

        // we can have more than one exclamation mark in Java. EX:
        boolean r3 = !!!true; // result is: false
        System.out.println(r3);






    }



}
