package BankAccount8;

public class Bank {
    private double balance = 500;
    public Bank(double balance) {
        this.balance += balance;
    }
    void withdraw(double amount) {
        if(balance - amount < 100) System.out.println("Withdrawal not allowed. Minimum balance should be maintained.");
        else balance -= amount;
    }
    void display(){
        System.out.println("Current Balance: " + balance);
    }
}
