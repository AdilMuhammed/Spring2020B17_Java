package OfficeHours.Practice_03_18_2020;

import java.util.jar.JarOutputStream;

public class UnaryOperators_Practice {

    public static void main(String[] args) {
        // post: first pass the current value, then increase/decrease the value
        int a = 20;
        System.out.println(a++);    // 20
        System.out.println(a);  //21

        int b = 30;
        int c = b--;    // c = 30,  b = 29
        System.out.println(b);
        System.out.println(c);

        int d = 40;
        int e = d++;    // e = 40,  d= 41
        System.out.println(d);
        System.out.println(e);


        // pre: change the value immediately
        int x = 200;
        System.out.println(--x);    // 199
        System.out.println(x);    // 199


        int z = 100; // 101, 100, 99, 100
        z = z++ + --z - z-- + ++z;
    //  z = 100 + 100 - 100 + 100
        System.out.println(z);

        int u = 900; // 901, 902, 903
        int r = - ++u + ++u + -u++;
        //  r = - 901 + 902 + -902
        //  r = 1 - 902 ===> -901
        System.out.println(u);
        System.out.println(r);






    }

}
