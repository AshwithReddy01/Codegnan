package ABS2;

public class Card extends Main {
    final double percent = 5;
    public Card(double balance, String AccountNumber){
        super(balance, AccountNumber);
    }
    public void online(double amount){
        double percentage = (amount * percent)/100;
        double amounts = amount + percentage;
        if(balance>=amounts){
            balance-=amounts;
            System.out.println("Amount :"+amount +" ,charges applied:"+ percentage+" , Total amount: "+amounts +" Balance: "+balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    
}
