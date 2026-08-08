class Account {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    Account (String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Error: Insufficient funds for " + accountHolder);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

}
    public class BankAccount {
        public static void main(String[] args) {
//            acc1
            Account account1 = new Account("Bob","ACC12375",403.42);
            account1.displayAccountInfo();
            account1.deposit(400.20);
            System.out.println();


//            acc2
            Account account2 = new Account("Brian","ACC64829",1000.90);
            account2.deposit(700.70);
            account2.withdraw(200.50);
        }
    }
