package opps;

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

    public static class Main {
        public static void main(String[] args) {
    //        Acc1
            Bank acc1 = new Bank("Brian",0);
            acc1.deposit(1);
            acc1.withdraw(0.5);
            System.out.println(acc1.getBalance());
            System.out.println(acc1.getOwnerName());
    //        Acc2
            Bank acc2 =new Bank("Alex", 100);
            acc2.deposit(100);
            acc2.withdraw(50.60);
            System.out.println(acc2.getOwnerName());
            System.out.println(acc2.getBalance());

        }
    }
}
