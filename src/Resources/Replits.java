package Resources;

import java.util.*;

public class Replits {

    //WRITE YOUR CODE HERE

    public static int[] mergR(int[] a,int[] b) {

        int combLength = a.length+b.length;
        int[] combineArray = new int[combLength];

        for (int z=0; z<a.length; z++){
            combineArray[z] = a[z];
        }

        for (int z=0; z<b.length; z++){
            combineArray[z+a.length] = b[z];
        }

        return combineArray;



    }//end mergR

    public static String clean (String text ,String badWord) {

        String result = "";
        while (text.contains(badWord)) {
             result = text.replaceFirst(badWord, "");
        }
        return result;

    }




}
