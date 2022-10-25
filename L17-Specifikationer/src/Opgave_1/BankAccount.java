package Opgave_1;

/**
 * Modellerer en bank konto.
 */
public class BankAccount {
    private double balance;
    private int id;
    private static int lastId;

    /**
     * Initialiserer en ny konto.
     * @param initialBalance
     * Pre: Saldo = 0
     */
    public BankAccount(double initialBalance){
        balance = initialBalance;
        BankAccount.lastId++;
        id = BankAccount.lastId;
    }

    /**
     * Registrerer et beløb der bliver tilføjet til kontoen.
     * @param amount
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * Registrerer et beløb der bliver trukket fra kontoen.
     * @param amount
     */
    public void withdraw(double amount){
        balance -= amount;
    }

    /**
     * Retunerer kontoens saldo.
     * @return kontoens saldo
     */
    public double getBalance(){

        return balance;
    }

    /**
     * Retunerer kontoens id.
     * @return kontoens id
     */
    public double getId(){

        return id;
    }

    /**
     * Retunerer antal brugte id
     * @return antal brugte id
     * Pre:
     */
    public static double getLastId(){
        return lastId;
    }


}
