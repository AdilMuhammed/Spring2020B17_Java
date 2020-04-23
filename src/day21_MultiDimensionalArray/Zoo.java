package day21_MultiDimensionalArray;

public class Zoo {

    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        //                   0   ,    1   ,     2    ,      3

        String[][] zoo = {wildAnimals, birds};
        //                     0     ,   1

        String kfc = zoo[1][3];     // "Chicken"

        System.out.println(kfc);


        System.out.println("================================================");

        for (String eachBirds : zoo[1]){
            if (eachBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }


        System.out.println("================================================");

        for (String eachWildAnimal : zoo[0]){
            if (eachWildAnimal.equals("Turtle")){
                continue;
            }
            System.out.println(eachWildAnimal);
        }


    }
}
