package Abstraction;

public class test {
    public static void main(String[] args) {
        SavingsAccount sc = new SavingsAccount(864651231, 4651.00);
        sc.withdraw(1000);
        CurrentAccount ca =new CurrentAccount(65465311, 3320);
        ca.deposite(1000);
        ca.withdraw(5000);
    }
    
}
