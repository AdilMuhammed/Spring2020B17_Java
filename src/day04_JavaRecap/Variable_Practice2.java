package day04_JavaRecap;

public class Variable_Practice2 {

    public static void main(String[] args) {

        /*
        task: write a program to find the area and primeter of the circle
        radius = ?
        Pi = 3.14

        Area = r * r * 3.14
        P = 2 * 3.14 * r
         */

        double radius = 2.5;   // Must
        double PI = 3.14;

        double area = radius * radius * PI;
        double primeter = 2 * PI * radius;

        // The area of the circle that has a radius of 2.5 is: Area

        System.out.println("The area of the circle that has a radius of "+radius+" is: "+area);
        System.out.println("The primeter of the circle that has a radius of "+radius+" is: "+primeter);

        double circle1R = 3;
        double circle2R = 5;

        boolean circle1 = circle1R > circle2R;
        boolean circle2 = circle2R > circle1R;

        System.out.println(circle1);
        System.out.println(circle2);





    }

}
