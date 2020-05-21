package day40_Encapsulation;

public class Person {

    public String name;

    private long SSN;
    private int ID;

    public Person(String name){
        this.name = name;
    }

    public long getSSN(){
        return SSN;
    }

    public void setSSN(long SNN){
        this.SSN = SNN;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setSSNAndID(long SSN, int ID){
        /*
        setSSN(SNN);
        setID(ID);
         */
        this.SSN = SSN;
        this.ID = ID;
    }







}
