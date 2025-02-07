import java.util.*;

class ATM {
    private String accountNumber;
    private int pin;
    private double balance;
    private List<String> transactionHistory;

    public ATM(String accountNumber, int pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean authenticate(String account, int inputPin) {
        return this.accountNumber.equals(account) && this.pin == inputPin;
    }

    public double checkBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount);
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            System.out.println("Withdrawal successful!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void showTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}

public class MiniATM {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a sample account
        ATM account = new ATM("123456789", 1234, 500.00);

        System.out.println("Welcome to Mini ATM System!");

        // Login attempt
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        if (account.authenticate(accountNumber, pin)) {
            System.out.println("Login successful!");

            while (true) {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: $" + account.checkBalance());
                        break;  
                    case 2:
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        account.showTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using Mini ATM. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid account number or PIN. Access denied.");
        }
    }
}