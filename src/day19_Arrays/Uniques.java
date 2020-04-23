package day19_Arrays;
/*
Wright a program that can return the unique characters from a string
    Ex: "AABCC" ===> "B"
 */
public class Uniques {

    public static void main(String[] args) {

        String str = "AABCC";

        String result = "";    // "B" ,  to store the unique characters


        for (int j=0; j <= str.length()-1; j++){
            int count = 0;   // to count occuirance of the character

            for (int i=0; i <= str.length()-1; i++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            if (count == 1){    // if unique
                result += str.charAt(j);
            }
        }

        System.out.println(result);

    }
}
