package Abstraction;

abstract class BankAccount {
    long AccountNumber;
    double balance;

    public BankAccount(long AccountNumber, double balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    
    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+"Amount is deposited ,Current balance: "+ balance );
        }
        else{
            System.out.println("Invalid amount entered");
        }
    }
    abstract void withdraw(double amount);
    
    
    
}
    
    

