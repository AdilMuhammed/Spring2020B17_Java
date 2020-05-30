package day45_Exceptions;

public class warmUp {

    public static void main(String[] args) {

        int pushups = 0;
        while (pushups<20){
            System.out.println("Pushup "+pushups);

            try {
                Thread.sleep(3000);
            }catch (Exception e){ }
            pushups++;
        }



    }



}
