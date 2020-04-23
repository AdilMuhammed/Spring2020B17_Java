package day22_Arrays_Loops;

import java.util.Arrays;

/*
3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
 */
public class Java_Python {

    public static void main(String[] args) {

        String sentence = "I like java and javascript";  // [I, like, java, and, javascript]
        int countJava = 0;   // 2
        int countPython =0;

        String[] words = sentence.split(" ");
        for (String each : words){
            if (each.contains("java")) {
                countJava += 1;
            }

            if (each.contains("python")) {
                countPython += 1;
            }

        }


        System.out.println(countJava);
        System.out.println(countPython);


    }
}
