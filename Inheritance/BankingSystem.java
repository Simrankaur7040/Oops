class BankAccount{
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayDetails(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
    }
}
class SavingsAccount  extends BankAccount{
    double interestRate;

    public SavingsAccount(String accountNumber, double balance,double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType(){
        System.out.println("Account Type : Savings Account ");
        System.out.println("Interest Rate"+interestRate);
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLmit;

    public CheckingAccount(String accountNumber, double balance,double withdrawalLmit) {
        super(accountNumber, balance);
        this.withdrawalLmit = withdrawalLmit;
    }
    public void displayAccountType(){
        System.out.println("Account Type : Checking Account");
        System.out.println("Withdrawal Limit :"+withdrawalLmit);
    }
}
class FixedDepositAccount extends BankAccount{
    int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }
    public void displayAccountType(){
        System.out.println("Account Type : Fixed Deposit Account :");
        System.out.println("Deposit Term :"+depositTerm + " months");
    }
}

public class BankingSystem{
    public static void main(String[] args){
        System.out.println("\n ------Savings Account-------");
        SavingsAccount sa = new SavingsAccount("HIH300", 2200, 4.5);
        sa.displayDetails();
        sa.displayAccountType();

        System.out.println("\n------Checking Account---------");
        CheckingAccount ca = new CheckingAccount("FGR200", 15000, 2000);
        ca.displayDetails();
        ca.displayAccountType();

        System.out.println("\n------Fixed Deposit Account--------");
        FixedDepositAccount fda = new FixedDepositAccount("FHR000", 50000,12 );
        fda.displayDetails();
        fda.displayAccountType();
    }
}