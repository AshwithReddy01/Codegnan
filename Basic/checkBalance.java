public class checkBalance {
    String AccHolder;
    double balance;
    long AccNum;
    public static void main(String[] args) {
        
        checkBalance balref = new checkBalance();
        balref.AccHolder ="Ashwith reddy";
        balref.balance = 250.535;
        balref.AccNum = 86816468L;
        balref.display();
        balref.Balancecheck();
        balref.AccHolder();


    }
    public String AccHolder(){
        return AccHolder;
    }
    public void display(){
        System.out.println("Name: "+AccHolder + "\nBalance: "+balance + "\nAccount Number: "+AccNum);
        
        
    }
    public void Balancecheck(){
        if(balance<1000){
            System.out.println("Insufficient Balance");
        }

    }

    
}
