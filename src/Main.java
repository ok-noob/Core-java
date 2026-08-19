public class Main {
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
