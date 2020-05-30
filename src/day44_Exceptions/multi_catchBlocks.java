package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println(100/0);
        }catch (ClassCastException e){
            System.out.println("Class Cast");
        }catch (NoSuchElementException e){
            System.out.println("No Such Element");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bounds");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }catch (RuntimeException e){
            System.out.println("Runtime");
        }catch (Exception e){
            System.out.println("Exception");
        }




    }



}
