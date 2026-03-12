import java.util.Scanner;
public class prgm3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter user age: ");
        int A =sc.nextInt();
        if(A>=18 && A< 100){
            System.out.println("Valid Age to vote");
        }
        else if(A<18 || A>=100){
            System.out.println("Invalid Age");
        }
    }
}
