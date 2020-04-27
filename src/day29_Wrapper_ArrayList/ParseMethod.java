package day29_Wrapper_ArrayList;

public class ParseMethod {

    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str);  // 123

        System.out.println(str+1);    // text
        //               "123" + 1 ===> "1231"
        System.out.println(a1+1);   // number
        //                123 + 1 ===> 124


        byte b1 = Byte.parseByte(str);     // byte = 123

        System.out.println(b1+5);

        Integer I1 = (int) Byte.parseByte(str);
        // Integer = (int) byte;
        // Integer = int;



        String str2 = "10.5";

        float f1 = Float.parseFloat(str2);     // float 10.5
        System.out.println(f1+1);

        double f2 = Double.parseDouble(str2);
        System.out.println(f2+3);


        String str3 = "2147483647";
        long num1 = Long.parseLong(str3);    // 2147483647L
        System.out.println(num1+2);

        Long num2 = Long.parseLong(str3);
        System.out.println(num2+2);


        String result1 = "TrUE";
        boolean r1 = Boolean.parseBoolean(result1);     // boolean
        System.out.println(!r1);


        String result2 = "faLSE";
        boolean r2 = Boolean.parseBoolean(result2);     // boolean
        System.out.println(!r2);


    }


}
