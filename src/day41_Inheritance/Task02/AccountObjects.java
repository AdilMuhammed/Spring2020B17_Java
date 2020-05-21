package day41_Inheritance.Task02;

public class AccountObjects {

    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
            obj.accountHolder = "Hunar";

        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withdraw(10000);
        obj.showBalance();

        System.out.println(obj);


        System.out.println("====================================");


        SavingAccount saving = new SavingAccount();
            saving.accountHolder = "Rahman";

        System.out.println(SavingAccount.interestRate);
        System.out.println(saving);

        saving.deposit(300000);
        saving.showBalance();



    }




}
