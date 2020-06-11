package day49_Polymorphisim;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone("iPhone 10 pro", 1000.50, "11 inches");

        System.out.println(phone1);
        phone1.calling(911);
        phone1.texting(199);
        phone1.faceTiming(1234);
        phone1.selfie();
        phone1.setDownloadable();


    }

}
