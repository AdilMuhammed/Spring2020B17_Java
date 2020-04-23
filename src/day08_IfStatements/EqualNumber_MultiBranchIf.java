package day08_IfStatements;
/*
write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
 */
public class EqualNumber_MultiBranchIf {

    public static void main(String[] args) {

        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;   // if n1 equal to n2 and does not equal to n3
        boolean n1Equaln3 = n1 == n3 && n1 != n2;   // if n1 equal to n3 and does not equal to n2
        boolean n2Equqln3 = n2 == n3 && n2 != n1;   // only n2 equal to n3
        boolean allEqual = n1 == n2 && n1 == n3;    // all of them are equal

        /* if(n1Equaln2){
            System.out.println("n1 is equal to n2");
        } else if(n1Equaln3){
            System.out.println("n1 is equal to n3");
        } else if(n2Equqln3){
            System.out.println("n2 is equal to n3");
        } else if(allEqual){
            System.out.println("n1 is equal to n2 and n3");
        } else {
            System.out.println("Non of them are equal");
        }
         */

        String result = " ";
        if(n1Equaln2){
            result = "n1 is equal to n2";
        } else if(n1Equaln3){
            result = "n1 is equal to n3";
        } else if(n2Equqln3){
            result = "n2 is equal to n3";
        } else if(allEqual){
            result = "n1 is equal to n2 and n3";
        } else {
            result = "Non of them are equal";
        }

        System.out.println(result);


    }
}
