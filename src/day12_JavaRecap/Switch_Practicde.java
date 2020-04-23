package day12_JavaRecap;

public class Switch_Practicde {

    public static void main(String[] args) {

        switch (3){
            case 1:
                System.out.println("Case 1");
                break;   // exits switch statement

            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Invalid Case");
        }


        System.out.println("=============================================");



        /*
        200, OK
        201, Created
        202, Accepted
         */

        int statusCode = 202;
        String result = "";

        switch (statusCode){
            case 200:
                //  System.out.println("Ok");
                result = "Ok";
                break;

            case 201:
                //  System.out.println("Created");
                result = "Created";
                break;

            case 202:
                //  System.out.println("Accepted");
                result = "Accepted";
                break;

            default:
                //  System.out.println("Invalid Status Code");
                result = "Invalid Status Code";
                break;

        }

        System.out.println(result);



    }

}
