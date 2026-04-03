package ABS2;

public class Cash extends Main{
    public Cash (double balance, String AccountNumber){
        super(balance, AccountNumber);
    }
    public void online(double amount){
    if(balance>=amount){
        balance-=amount;
        System.out.println("Amount paid :"+amount +" ,charges applied: 0 , Total amount: "+amount +" Balance: "+balance);
    }
    else {
        System.out.println("insufficent balance");
    }

    }
    

    }
    

