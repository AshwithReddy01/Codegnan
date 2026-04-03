package ABS2;

public class UPI extends Main{
    final double percent = 2;
    public UPI(double balance,String AccountNumber){
    super(balance, AccountNumber);


    }
    public void online(double amount){
        double percentage = (amount * percent)/100;
        double amounts = amount+ percentage;
        if(balance >= amount){
        balance-=amounts;
        System.out.println("Amount :"+amount +" ,charges applied:"+ percentage+" , Total amount: "+amounts + " Balance: "+balance);
        }
        else {
            System.out.println("inssuficient balance");

        }
        
    }
    
}
