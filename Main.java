class BankAccount{
    protected String accountNumber;
    protected String accountHolderName;
    private Double Balance; 
    
    public BankAccount(String Name,String AccNo,Double bal){
        this.accountHolderName = Name ;
        this.accountNumber = AccNo;
        this.Balance =bal;
    }

    public void deposit(Double Amount){
        this.Balance += Amount;
    }
    public void withdraw(Double Amount){
        this.Balance -= Amount;
    }

    public Double getBalance() {
        return Balance;
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Balance: "+getBalance());
    }
} 
class SavingAccount extends BankAccount{
    protected Double interestRate;
    
    public SavingAccount(String accHolderName,String accountNum,Double bal,Double IntRate){
        super(accHolderName, accountNum, bal);
        this.interestRate = IntRate;
    }
    public void calculateInterest(){
        super.deposit((getBalance()*interestRate));
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Interest Rate: "+interestRate);
    }
}
public class Main {
    public static void main(String[] args) {
        SavingAccount Acc1 = new SavingAccount("Hamza","PK123456789123", 55000.0, 0.05);
        Acc1.deposit(26000.0);
        Acc1.display();
        Acc1.withdraw(11560.2);
        Acc1.display();
        Acc1.calculateInterest();
        Acc1.display();
    }
    
    
}
