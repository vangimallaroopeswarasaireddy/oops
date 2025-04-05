class InsufficientFundsException extends Exception { 
public InsufficientFundsException(String message){
super(message);
}
}
class BankAccount {
private double balance = 1000;
public void withdraw(double amount) throws InsufficientFundsException { 
if (amount > balance) {
throw new InsufficientFundsException("Insufficient balance for withdrawal");
}
balance -= amount;
System.out.println("Withdrawal successful. Remaining balance:" + balance);
}
}
public class Bankapp {
public static void main(String[] args) { 
BankAccount account = new BankAccount();
try {
account.withdraw(1500);
} catch (InsufficientFundsException e) { 
System.out.println("Error:" + e.getMessage());
}
}
}