package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {


    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    // remove duplicates from string
    public static String RemoveDuplicates(String str){
        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        return result;
    }


    // Frequency of string
    public static int Frequency(String str1, String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // We need make that we are not counting the same index over again
        }
        return count;
    }


    // Frequency of all characters in any string
    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);  // ABC
        String result = "";

        for (int i=0; i<NonDup.length(); i++){
            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }
        return result;
    }




    public static String uniques(String str){
        String result = "";
        for (int i=0; i<str.length(); i++){
            int num = Frequency(str,str.charAt(i));
            if (num==1){
                result += str.charAt(i);
            }
        }
        return result;
    }




    public static int Frequency(String str, char ch){
        char[] arr = str.toCharArray();   // [A, A, A]
        int count = 0;
        for (char each: arr){
            if(each==ch){
                count++;
            }
        }
        return count;
    }


    //Maxsimum number from Array list
    public static int max(ArrayList<Integer> list){

        Integer max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){    //i: 0, 1, 2, 3, 4
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

    // merge two array and return as a third one

    // max number from array

    // min number from array


}
