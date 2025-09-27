interface Loanable{
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount implements Loanable{
    String accountNumber;
    String holderName;
    double balance;

    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
           balance += amount;
           System.out.println(amount+ " deposited New Balance :"+balance);
        }else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawed New Balance :"+balance);
        }else{
            System.out.println("Insufficient Balance or Invalid Amount ");
        }
    }
    public abstract double calculateInterest();
    public void displayDetails(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Holder Name :"+holderName);
        System.out.println("Account Balance :"+balance);
        System.out.println("Interest :"+calculateInterest());
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance,double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest(){
        return getBalance() * interestRate / 100;
    }
    public void applyForLoan(double amount){
        System.out.println("Savings Account : Loan of "+amount+" applied");
    }
    public double calculateLoanEligibility(){
        return getBalance() * 0.5;
    }
}
class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit){
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public double calculateInterest(){
        return 0;
    }
    public void applyForLoan(double amount){
        System.out.println("Current Account : Loan of "+amount+ " applied");
    }
    public double calculateLoanEligibility(){
        return getBalance() + overdraftLimit;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S101", "simran", 5000,4),
            new CurrentAccount("C201", "riya", 10000,5000),
        };
        System.out.println("----Banking System-----");
        for(BankAccount acc : accounts){
            acc.displayDetails();

            acc.applyForLoan(2000);
            System.out.println("Eligible Loan Amount :"+acc.calculateLoanEligibility());
            System.out.println("-----------------------");
        }
    }
}