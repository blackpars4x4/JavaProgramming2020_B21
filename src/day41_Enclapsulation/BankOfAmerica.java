package day41_Enclapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Josh", "Jones", 123456);

        System.out.println(obj1.getAccountHolder());
        System.out.println(obj1.getBalance());

        obj1.deposit(-200);
        obj1.availableBalance();

        System.out.println("===========================================");

        obj1.deposit(100);
        obj1.availableBalance();

        /*BankAccount.bankName = "Capital One";*/
        System.out.println(BankAccount.bankName);




    }
}
