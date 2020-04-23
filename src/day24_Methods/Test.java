package day24_Methods;

import java.util.Arrays;
import Resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "Cybertek";

        String RevStr = Library.Reverse(str);
        System.out.println(str.equals(RevStr));

        int[] arr = {100, 300, 200, 40000, 50000,10000000};

        arr =    Library.sortDesending(arr);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));



    }

}
