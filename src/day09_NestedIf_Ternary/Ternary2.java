package day09_NestedIf_Ternary;

public class Ternary2 {

    public static void main(String[] args) {

        // ternary: ? means if, : else
        String result = "";
        if(9 > 10){
            result = "9 is greater";
        }else {
            result = "10 is greater";
        }
        System.out.println(result);

        String result2 = (9 > 10) ? "9 is greater" : "10 is greater";
        System.out.println(result2);


        System.out.println("==============================================");

        int age = 20;
        boolean eligibility = (age >= 21) ? true : false;

        /*
        if(age >= 21){
            eligibility = true;
        }else {
            eligibility = false;
        }
         */

        System.out.println(eligibility);


        System.out.println("==============================================");

        int ageOfPerson = 17;
        String eligibleToVote = "";
        if(ageOfPerson >= 18){
            eligibleToVote = "Yes";
        }else {
            eligibleToVote = "No";
        }
        System.out.println(eligibleToVote);

        String eligibleToVote2 = (ageOfPerson >= 18) ? "Yes" : "No";
        System.out.println(eligibleToVote2);



    }


}
