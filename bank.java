public class bank {
    String AccountHolder;
    long AccNum;
    double balance;
    public static void main(String[] args) {
        bank bankref = new bank();
        bankref.AccountHolder="Ashwith Reddy";
        bankref.AccNum=5856446565465456L;
        bankref.balance=15343515432.562d;
        bankref.display();

        bank checkBalance = new bank();
        
    }
    public void display(){
        System.out.println("Name: " + AccountHolder + ", Account Number: " + AccNum + ", Balance: " + balance);
    }

    
}
