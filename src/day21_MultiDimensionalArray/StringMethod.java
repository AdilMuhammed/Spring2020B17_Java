package day21_MultiDimensionalArray;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String name = "Java";   // 'J','a' 'v', 'a'

        char[] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);
        System.out.println(Arrays.toString(chars));


        String str = "I like Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence: day great is today
         */
        String sentence = "today is great day";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));   // [Today, is great, day]

        String result = "";

        for (int i=words.length-1; i>=0; i--){
            String eachWords = words[i];
            // System.out.print(eachWords+" ");
            result += eachWords+" ";
        }

        System.out.println(result);


        String str2 = "ABCD";
        String arr2[] =   str2.split("")  ;      //["A", "B", "C", "D"]
        char[] ch2 = str2.toCharArray(); //['A', 'B', 'C', 'D']

        System.out.println( Arrays.toString(arr2) );
        System.out.println( Arrays.toString(ch2));
    }
}
