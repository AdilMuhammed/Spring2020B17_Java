package day14_StringClass;

public class Practice {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userInputGmail);  // true

        if(result){
            System.out.println("Logged in");
        }



        System.out.println("==============================================================");

        /*
        valid password should not contain space
         */

        String PassWord = "mmasd1235";

        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else {
            System.out.println("Valid password");
        }


        System.out.println("==================================================");

        /*
        every website has "www." at the beginning of the web address
         */

        String webAddress = "www.amazon.com";
        if(webAddress.startsWith("www.")){
            System.out.println("Valid");
        }

        System.out.println("========================================");


        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("Invalid gmail");
        }




    }
}
