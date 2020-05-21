package day42_Inheritance.Task02;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv1 = new TV("Samsung", "Serrius5", 300, "55 inches");
        System.out.println(tv1);

        tv1.country = "USA";
        System.out.println(tv1);

        System.out.println();


        Phone phone1 = new Phone("Iphone", "11", 1000, "large");
        System.out.println(phone1);




    }




}
