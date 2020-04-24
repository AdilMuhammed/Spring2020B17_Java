package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // 2020-03-20  11:25:30
        LocalDate date = LocalDate.of(2020, 03, 20);
        LocalTime time = LocalTime.of(11, 25, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2020, 03, 20, 11, 25, 30);
        System.out.println(dateTime1);






    }


}
