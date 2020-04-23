package day05_Unary_ShortHandOperators;

public class PostPrePractice {

    public static void main(String[] args) {

        int a = 50;
        a = --a + a++ + a-- + a++;
        //   49 + 49  + 50  + 49

        System.out.println(a);  // 197
        System.out.println(++a);   // 198
        System.out.println(a++);    //198
        System.out.println(a);    //199


        int x = 4;
        int y = x * 4 - x++;
        //  y = 4 * 4 - 4
        System.out.println(y);



        int b = 1;
        b = -b-- + b++ / -b-- * --b;
        //b = -1 + 0   / -1   * -1
        //b = -1 +0 * -1
        //b = -1 + 0
        //b == -1
        System.out.println(b);






    }

}
