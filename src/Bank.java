public class Bank {
    private double Balance;
    private String ownerName;

    public  Bank(String ownerName, double startingBalance) {
        if (startingBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.ownerName = ownerName;
        this.Balance = startingBalance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance() {
        return Balance;
    }

    public void deposit (double amount) {
            if (amount <= 0)
            throw new IllegalArgumentException("Deposit must be positive");
            Balance += amount;
        }
        public void withdraw (double amount) {
        if ( amount <=0 )
            throw new IllegalArgumentException("Withdraw must be positive");
        if (amount > Balance)
            throw new IllegalStateException("Insufficient funds");
        Balance -= amount;
        }

    }
