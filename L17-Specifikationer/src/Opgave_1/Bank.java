package Opgave_1;

public class Bank {
    public static void main(String[] args) {
        BankAccount Magnus = new BankAccount(0);
        Magnus.deposit(100);
        System.out.println(Magnus.getBalance());
        System.out.println(Magnus.getId());
        System.out.println("...");

        BankAccount Torben = new BankAccount(0);
        Torben.withdraw(50);
        System.out.println(Torben.getBalance());
        System.out.println(Torben.getId());
        System.out.println("...");

        System.out.println(Magnus.getBalance());
        System.out.println(Magnus.getId());

        System.out.println("...");
        System.out.println(BankAccount.getLastId());
    }
}
