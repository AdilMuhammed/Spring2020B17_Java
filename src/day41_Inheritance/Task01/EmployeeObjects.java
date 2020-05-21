package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer(200000, "Rahman", 123, "Software Developer", 'M');

        // dev1.reporting();
        dev1.coding();
        dev1.fixingBug();
        System.out.println(dev1);


        Tester tester1 = new Tester("Barzy", 165000, 456, "SDET", 'M');

        // tester1.coding();
        tester1.testing();
        tester1.reporting();
        System.out.println(tester1);


        BusinessAnalyst BA1 = new BusinessAnalyst("Hunar", 200000, 789, 'M');

        // BA1.coding();
        // BA1.testing();
        BA1.gathering();
        BA1.writingReq();
        System.out.println(BA1);




    }




}
