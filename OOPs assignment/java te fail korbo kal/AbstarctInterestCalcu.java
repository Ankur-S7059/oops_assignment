abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    public Accounts(String accountNumber, String accountHoldersName, String address) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = 0.0;
    }

    // Abstract method for withdrawal
    public abstract void withdrawal(double amount);

    // Abstract method for deposit
    public abstract void deposit(double amount);

    // Method to display balance
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    // Method to calculate interest amount
    public void calculateAmount() {
        double interestAmount = balance * rateOfInterest / 100;
        System.out.println("Interest Amount: " + interestAmount);
    }

    // Implementation of abstract methods
    @Override
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }
}

public class AbstarctInterestCalcu {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount account = new SavingsAccount("123456789", "Ankur Saha", "123 kolkata india 03", 5.0);
        
        // Deposit some amount
        account.deposit(1000);
        
        // Withdraw some amount
        account.withdrawal(500);
        
        // Display balance
        account.display();
        
        // Calculate interest amount
        account.calculateAmount();
    }
}
