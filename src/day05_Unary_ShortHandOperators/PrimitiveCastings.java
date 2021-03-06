package day05_Unary_ShortHandOperators;

public class PrimitiveCastings {

    public static void main(String[] args) {

       // Implicit casting: done automatically
        int a = 10;
        long b = a;  // implicit casting is done automatically
            // b = 10L;

        // int c = b;  , give compiler error, Coz b is still long datatype

        int a1 = 100;
        long b1 = (long) a1;   // manually doin the implicit casting


        // Explicit casting:
        int Inum = 100;
        byte Bnum = (byte) Inum;

        short Snumn= (short) Inum;    // or short Snum = (byte) Inum, it has to be itself or less than

        double Dnum = 5.5;
        //float Fnum = (float) Dnum;  // 5.5
        float Fnum = (int) Dnum;  // 5.0
            // Fnum = (int)5.5
            // Fnum = 5
            // Fnum = 5.0

        System.out.println(Fnum);

        double D1 = 10.5;
        // long L1 = (long) ((float)D1)
        long L1 = (int)D1;
        System.out.println(L1);  // 10

        float F1 = 60.5f;
        int I1 = (int) F1;    // prefered
        System.out.println(I1);

        long LargeNum = 9999999999l;
        int intNum = (int) LargeNum;
        System.out.println(intNum);  // it gives a different num COz 999999999 is out of int' range

        char ch1 = 'a';
        short sh1 = (short) ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        double dbl1 = ch2;   // 23456.0
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1;   // 10.0
        short y1 = (short) z1;
        System.out.println(y1);






    }

}
