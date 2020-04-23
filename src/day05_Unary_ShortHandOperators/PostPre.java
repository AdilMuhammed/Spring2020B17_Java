package day05_Unary_ShortHandOperators;

public class PostPre {

    public static void main(String[] args) {

        // Pre: change the value of variable immediately

        int a = 100;
        System.out.println(++a);    //101
        System.out.println(a);

        int b = 100;
        System.out.println(--b);    //99
        System.out.println(b);  //99


        // Post: first passes the current value, then eventually changes the variable value
        int A = 100;
        System.out.println(A++);    // at line 20, A' value is still 100
        System.out.println(A);   //101

        int B = 100;
        System.out.println(B--);    //100
        System.out.println(B);    //99


        // Post & Pre examples:
        int z =10;
        int x = ++z;    // at line 30, x is increased by 1
        System.out.println(x);  // 11
        System.out.println(z);  //11

        int s = 10;
        int f = s++;    // 10, after line 35, the value os s' will be increased by 1
        System.out.println(f);  //10
        System.out.println(s);  //11

        double t1 = 3.5;
        double t2 = t1++;   //3.5, after line 40 t1 will be increased by 1
        System.out.println(t2); // 3.5
        System.out.println(t1); // 4.5


        int num = 35;
        System.out.println(num++);  // 35, after line 46 the value of num will be 36
        System.out.println(num--);  //36, after line 47 the value of num will be 35




    }

}
