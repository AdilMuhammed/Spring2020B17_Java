package day50_polymorphism;
/*
 3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */
public class Dog extends Animal {  // 3 var, 3 ins method

    public String dogName;

    public Dog(String dogName, int age, String gender){
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog "+dogName+" sleeping");
    }

    public void bark(){
        System.out.println("Dog "+dogName+" barking");
    }

    public static void methodA(int a){
        System.out.println("Dog class A");
    }


}
