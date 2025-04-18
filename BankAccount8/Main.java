package BankAccount8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        double withdraw = input.nextDouble();
        Bank a = new Bank(balance);
        a.withdraw(withdraw);
        a.display();
    }
}
