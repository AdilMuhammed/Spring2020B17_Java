package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    /*
         write a program to identify if a string is palindrome or not. if yes==> true,.otherwise ==> false
                 level ==> level ==> palindrome
          */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.nextLine();
        String reversWord = "";

        for (int i = word.length()-1; i>=0; i--){
            reversWord += word.charAt(i);
        }

        boolean palindrome = word.equalsIgnoreCase(reversWord);

        System.out.println(palindrome);


    }
}
