import java.util.Scanner;
public class prgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks: ");
        int m = sc.nextInt();
        if(m>=90){
            System.out.println("A Grade");
        }
        else if(m>=80){
            System.out.println("B Grade");
        }
        else if(m>=70){
            System.out.println("C Grade");
        }
        else if(m>=60){
            System.out.println("D Grade");
        }
        else if(m>=50){
            System.out.println("E Grade");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
