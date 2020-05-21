package day42_Inheritance.Task02;
/*
create ba class called phone:
	  attributes: brand, model, price, country, type, size
	  methods: call, text,  toString
 */
public class Phone extends Device {
    /*
    brand  (inherited)
    model  (inherited)
    price  (inherited)
    country  (inherited)
    type  (inherited)
    size  (inherited)

    setDevice()  (inherited)

    call()
    text()
    toString()  (inherited)
     */

    public Phone(String brand, String model, double price, String size){
        setDevice(brand, model, price, "phone, ", size);
    }

    public void call(long number){
        System.out.println("Calling the number: "+number);
    }

    public void text(long number){
        System.out.println("Texting to: "+number);
    }






}
