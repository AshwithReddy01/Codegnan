package Abstraction;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(int AccountNumber,double balance){
        super(AccountNumber,balance);
    }
    void withdraw(double amount){
        final double MIN_BALANCE = -5000;
        if(balance-amount>MIN_BALANCE){
            balance-=amount;
            System.out.println("withdraw Sucessfull, Remaining balance: "+balance );
        }

    }


    
}
