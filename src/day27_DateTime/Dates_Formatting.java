package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));


        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Apr/23/20
        */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMMM/dd/yy");
        LocalDate birthday = LocalDate.of(1983, 06, 10);
        System.out.println(birthday.format(dtf2));



    }


}
