package day26_MethodOverLoading;

public class Unique {

    public static void main(String[] args) {

        String str = "ABB";

        String result = "";
        for (int i=0; i<str.length(); i++){
            int num = Frequency(str,str.charAt(i));
            if (num==1){
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        String str2 = "AABBCCDERRGGFF";
        String result2 = uniques(str2);
        System.out.println(result2);

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





}
