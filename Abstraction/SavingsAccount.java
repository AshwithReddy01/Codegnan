package Abstraction;

public class SavingsAccount extends BankAccount{
    final double MIN_BALANCE = 1000;
    public SavingsAccount(long AccountNumber , double balance){
        super(AccountNumber, balance);
    } 
   
    
    public void withdraw(double amount){
        if(balance-amount>1000){
            balance-=amount;
            System.out.println("withdraw sucessful, Remaining balance: "+balance);
        }
    }


}
































   /*  void withdraw(double amount){
        if(balance-amount<1000){
            System.out.println("Insufficient Funds");
        }
        else{
            balance-=amount;
        }
    }*/
    

