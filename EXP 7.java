import java.util.InputMismatchException;
import java.util.Scanner;
class InsufficientBalanceException extends Exception {
public InsufficientBalanceException(String message) {
super(message);
}
}
class BankAccount {
private double balance;
public BankAccount(double balance) {
this.balance = balance;
}
public void withdraw(double amount)
throws InsufficientBalanceException {
if (amount > balance) {
throw new InsufficientBalanceException(
"Withdrawal failed! Insufficient balance.");
}


balance -= amount;
System.out.println("Withdrawal Successful.");
System.out.println("Remaining Balance : Rs. " + balance);
}
}
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter Initial Balance : ");
double balance = sc.nextDouble();
BankAccount account = new BankAccount(balance);
System.out.print("Enter Withdrawal Amount : ");
double amount = sc.nextDouble();
account.withdraw(amount);
}
catch (InputMismatchException e) {
System.out.println("Error: Please enter numeric values only.");
}
catch (InsufficientBalanceException e) {
System.out.println("Error: " + e.getMessage());
}

finally {
System.out.println("Transaction Completed.");
sc.close();
}
}
}