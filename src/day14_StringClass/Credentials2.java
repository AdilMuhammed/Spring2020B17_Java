package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    /*
       valid credentials are:
           username: Cybertek
           password: cybertekschool

  precondition:    username and passowrd cannot be empty
                   if they are epty ==> please enter the credentials

       if user entered both valid username and password  ==> log in
       if valid password, invalid username ==> username is incorrect
       if valid user name, invalid password ==> password is incorrect
       if both password and username are invalied ==> invalid username and password
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.next();

        System.out.println("Enter your password");
        String inputPassword = input.next();

        boolean loggedIn = inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
                    // user entered both valid username and password
        boolean InvalidUserName = ! inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
                    // user entered invalid username and valid password
        boolean InvalidPassword = inputUsername.equals("Cybertek") && ! inputPassword.equals("cybertekschool");
                    // username is valid, but password is invalid

        if(!inputUsername.isEmpty() && !inputPassword.isEmpty()){   // username and password are not empty

            if(loggedIn){
                System.out.println("Logged in");
            }else if(InvalidUserName){
                System.out.println("Password is correct, username is incorrect");
            }else if(InvalidPassword){
                System.out.println("username is correct, Password is incorrect");
            }else {
                System.out.println("Both username and password are incorrect");
            }

        }else {     // username and password are empty
            System.out.println("Please input credentials");
        }

    }
}
