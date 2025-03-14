import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount) {
        if (amount>0) {
            balance+=amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount<=balance) {
            balance-=amount;
            System.out.println("Withdrew: " + amount);
        } else {
            throw new InsufficientFundsException("Insufficient funds for the withdrawal.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class BSDSF22A025_Web_Lab04_task1 {
    public static void main(String[] args) {
        
        BankAccount account=new BankAccount("123456789", 1000.0);

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the amount you want to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();

        try {
            account.withdraw(amountToWithdraw);
            System.out.println("Remaining Balance: " + account.getBalance());
        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
        scanner.close();
    }
}
