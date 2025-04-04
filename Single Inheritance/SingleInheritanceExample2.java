class BankAccount {
    String accountHolder;
    double balance;
 
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
 
    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate = 5.0; 
 
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
 
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Annual Interest: $" + interest);
    }
}
 
public class SingleInheritanceExample2 {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("John Doe", 5000);
        acc1.showBalance();
        acc1.calculateInterest();
    }
}
