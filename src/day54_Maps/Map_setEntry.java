package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {

    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
            countries.put("USA", "Wshaington DC");
            countries.put("Spain", "Madrid");
            countries.put("Italy", "Roma");
            countries.put("France", "Paris");
            countries.put("Germany", "Berlin");


        String input = "usa";
        for(Map.Entry<String, String>   each : countries.entrySet()  ) {
            // System.out.println( "Capital city of" + each.getKey() + " is : " + each.getValue() );
            String countryName = each.getKey();
            String cityName = each.getValue();

            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }

        }


    }



}
