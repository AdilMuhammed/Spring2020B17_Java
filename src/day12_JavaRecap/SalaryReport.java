package day12_JavaRecap;
/*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */

import java.util.Scanner;

public class SalaryReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your company name");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN");
        long SSN = input.nextLong();

        input.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job title is: "+jobTitle);
        System.out.println("Company name is: "+companyName);
        System.out.println("SSN is: "+SSN);
        System.out.println("Salary is: $"+fullName);


    }

}
