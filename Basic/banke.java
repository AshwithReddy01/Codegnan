public class banke {
    String Name;
    int AccNum;
    long balance;

    banke(String N, int AccNum, long balance){
        this.Name=N;
        this.AccNum=AccNum;
        this.balance=balance;
    }
    public static void main(String[] args) {
        banke b =new banke("Ashwith", 35643, 5542);
        System.out.println(b.Name);
        System.out.println(b.AccNum);
        System.out.println(b.balance);
    }
    
}
