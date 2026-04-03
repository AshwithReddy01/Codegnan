public class bank {
    String AccountHolder;
    long AccNum;
    double balance;
    public static void main(String[] args) {
        bank bankref = new bank();
        bankref.AccountHolder="Ashwith Reddy";
        bankref.AccNum=5856446565465456L;
        bankref.balance=153d;
        bankref.display();
        bankref.checkBalance();
        }
        public void checkBalance(){
        if(balance<1000){
            System.out.println("Insufficient Balanace");
        }
    }
    public void display(){
        System.out.println("Name: " + AccountHolder + ", Account Number: " + AccNum + ", Balance: " + balance);
    }

    
}
