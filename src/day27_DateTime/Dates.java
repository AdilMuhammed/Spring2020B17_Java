package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {

        LocalDate myBirthday = LocalDate.of(1983, 6, 10);
        System.out.println(myBirthday);

        LocalDate date = LocalDate.of(2009, 9,1);
        System.out.println(date);


        // isAfter(date2)
        boolean result1 = date.isAfter(myBirthday);
        System.out.println(result1);    // true


        // isBefore(date2)
        boolean result2 = myBirthday.isBefore(date);
        System.out.println(result2);    // true


        // isEqual(date2)
        boolean result3 = date.isEqual(myBirthday);
        System.out.println(result3);    // false

        // isLeapyear
        boolean result4 = myBirthday.isLeapYear();
        System.out.println(result4);


        System.out.println("======================================");

        LocalDate now = LocalDate.now();
        System.out.println("Today is: "+now);

        String str = now.toString();
        System.out.println(str);
        System.out.println(str.replace("-", "/"));

    }


}
