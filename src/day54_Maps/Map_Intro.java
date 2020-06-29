package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {


    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
            employeeInfo.put("Rahman", 130000.0);
            employeeInfo.put("Barzy", 1250000.0);
            employeeInfo.put("Hunar", 120000.0);
            employeeInfo.put("Adil", 115000.0);

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println(employeeInfo.get("Hunar"));

        employeeInfo.remove("Adil");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Hunar", 125000.0);

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());


        System.out.println("======================================");


        Map<String, LocalDate> classMate = new LinkedHashMap<>();
            classMate.put("Barzy", LocalDate.of(1990, 02, 14));
            classMate.put("Hunar", LocalDate.of(1984, 02, 14));
            classMate.put("Rahman", LocalDate.of(1992, 02, 14));
            classMate.put("Adil", LocalDate.of(1983, 06, 10));

        System.out.println(classMate);
        System.out.println(classMate.size());


        boolean r1 = classMate.containsKey("Adil");
        System.out.println(r1);

        boolean r2 = classMate.containsValue(LocalDate.of(1990, 02, 14));
        System.out.println(r2);





    }


}
