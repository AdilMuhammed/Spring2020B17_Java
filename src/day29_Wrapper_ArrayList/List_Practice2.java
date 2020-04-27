package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    /*
       1. create a list of Integers
       2. add 5 Integers to it
       3. return the maximum number from the list
       Do not use any sorting
    */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);

        System.out.println(list);

        Integer max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){    //i: 0, 1, 2, 3, 4
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(max);


        Integer max2 = list.get(0);
        for (Integer each : list){
            if (each>max2){
                max2 = each;
            }
        }
        System.out.println(max2);


        Integer min = list.get(0);
        for (Integer each : list){
            if (each<min){
                min = each;
            }
        }
        System.out.println(min);



    }
}
