package day50_polymorphism;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        int a = 100;
        double b = a;  // implicitly done

        Dog dog = new Dog("a", 1, "f");
        Animal animal1 = dog;  // upcasting, done implicitly

        Cat cat = new Cat("r", "f", 4);
        // Dog dog2 = Cat;

        Animal animal2 = (Animal) cat;   // upcasting, done implicitly


        System.out.println("===========================================");

        double c = 10;
        int d = (int) c;   // explicitly done

        Animal animal3 = new Dog("A", 12, "F");
        Dog dog3 = (Dog) animal3;   // down casting, MUST be done manually

        Animal animal4 = new Cat("C", "f", 7);
        Cat cat4 = (Cat) animal4;


        System.out.println("==================================");


        Animal animal5 = new Dog("Lucy", 3, "Female");
        // animal5.bark();
        Dog dog2 = (Dog)animal5;
        dog2.bark();
        // second way:
        ((Dog)animal5).bark();






    }



}
