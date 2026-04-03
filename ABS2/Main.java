package ABS2;

public abstract class Main {
    double balance;
    String AccountNumber;
    public Main(double balance,String AccountNumber){
        this.balance=balance;
        this.AccountNumber=AccountNumber;
    }
    abstract void online(double amount);

    
}
