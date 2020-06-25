package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collection2 {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Hunar", "Barzy", "Rahman", "Adil", "Ary", "Hardi",
                "Aryan", "Aryan", "Aryan", "Aryan", "Aryan", "Hemn" ));

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.toLowerCase().contains("r")){
                it.remove();
            }
        }

        System.out.println(names);


        System.out.println("=================================");


        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList("Hunar", "Barzy", "Rahman", "Adil", "Ary", "Hardi",
                "Aryan", "Aryan", "Aryan", "Aryan", "Aryan", "Hemn" ));

        for (Iterator<String> I = students.iterator(); I.hasNext();){
            String s = I.next();
            if (s.contains("r") || s.contains("R")){
                I.remove();
            }
        }
        System.out.println(students);


        System.out.println("=================================");


        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList("Hunar", "Barzy", "Rahman", "Adil", "Ary", "Hardi",
                "Aryan", "Aryan", "Aryan", "Aryan", "Aryan", "Hemn" ));

        n.removeIf( s -> s.contains("r") || s.contains("R") );

        System.out.println(n);


        System.out.println("=================================");


        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList("Hunar", "Barzy", "Rahman", "Adil", "Ary", "Hardi",
                "Aryan", "Aryan", "Aryan", "Aryan", "Aryan", "Hemn" ));

        T.removeAll(Arrays.asList("Hunar", "Barzy", "Rahman", "Ary", "Hardi",
                "Aryan", "Aryan", "Aryan", "Aryan", "Aryan"));
        System.out.println(T);


        System.out.println("=================================");


        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList("Hunar", "Barzy", "Rahman", "Adil", "Ary", "Hardi",
                "Aryan", "Aryan", "Aryan", "Aryan", "Aryan", "Hemn" ));

        R.retainAll(Arrays.asList("Adil", "Hemn"));

        System.out.println(R);


        System.out.println("=================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        // verify 5,6,9,8 are contained in the list
        boolean result = list.containsAll(Arrays.asList(5,6,9,8));
        System.out.println(result);


        System.out.println(list.containsAll(Arrays.asList(5,6,9,8,11)));






    }


}
