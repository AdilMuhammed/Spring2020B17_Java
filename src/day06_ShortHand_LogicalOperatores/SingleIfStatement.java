package day06_ShortHand_LogicalOperatores;

public class SingleIfStatement {

    public static void main(String[] args) {

        boolean coldWeather = true;
        if(coldWeather){
            // jus print in consule if the condition is true
            System.out.println("wear your hat");
            System.out.println("wear your jacket");
        }


        boolean coronaDetected = false;
        if(coronaDetected){
            // doesn't print in consule
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");


        }

        System.out.println("===================================================");

        int a = 99;
        boolean evenNumber = a % 2 == 0; // if a number can be devided by 2  it is even number
        // boolean oddNumber = a % 2 != 0;  // if a number cannot be devided by 2  it is odd number
        if(evenNumber){
            System.out.println(a +" is even number");
        }
        if(!evenNumber){  // if the number is not even number, then it must be odd
            System.out.println(a +" is odd number");
        }





    }

}
