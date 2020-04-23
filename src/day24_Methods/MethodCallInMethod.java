package day24_Methods;

public class MethodCallInMethod {

    public static void printHello(){

        System.out.println("Hello");

    }

    public static void printCybertek(){
        System.out.println("Cybertek");
    }


    public static void printHelloCybertek(){
        printHello(); // Hello
        printCybertek(); //Cybertek

    }


    public static void main(String[] args) {
        printHelloCybertek();
    }



}
