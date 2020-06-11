package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("X", 1000, "10 inches");
        iPhone iphone2 = new iPhone("8", 900, "8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(12345678);
        iphone1.calling(911);
        iphone1.texting(987654);


        System.out.println("===============================");


        Samsung samsung1 = new Samsung("Note10 Plus", 910, "12 inches");

        System.out.println(samsung1);

        samsung1.calling(1234567);
        samsung1.texting(87654321);
        samsung1.freezing();

    }


}
