package day08_IfStatements;

public class MultiBranchIf_Practice {

    public static void main(String[] args) {

        double score = 95.5;    // max score is 100
        // please assume that grade is 0 ~ 100

        boolean Agrade = score >= 90 && score <= 100;
        boolean Bgrade = score >= 80 && score < 90;
        boolean Cgrade = score >= 70 && score < 80;
        boolean Dgrade = score >= 60 && score < 70;

         char grade = ' ';

        if(Agrade){
            grade = 'A';
        } else if(Bgrade){
            grade = 'B';
        } else if(Cgrade){
            grade = 'C';
        } else if(Dgrade){
            grade = 'D';
        } else {
            grade = 'F';
        }

        /* String grade = " ";

        if(Agrade){
            grade = "A";
        } else if(Bgrade){
            grade = "B";
        } else if(Cgrade){
            grade = "C";
        } else if(Dgrade){
            grade = "D";
        } else {
            grade = "F";
        }
         */

        System.out.println("Score "+score+" is "+grade);


    }

}
