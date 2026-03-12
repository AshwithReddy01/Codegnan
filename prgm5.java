import java.util.Scanner;
public class prgm5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Day in words: ");
        String a= sc.nextLine();
        switch(a){
            case "Monday":
                System.out.println("Monday is Day 1 of the week");
                break;
            case "Tuesday":
                System.out.println("Tuesday is Day 2 of the week");    
                break;
            case "Wednesday":
                System.out.println("Wednesday is the Day 3 of the week");
                break; 
            case "Thursday":
                System.out.println("Thursday is the Day 4 of the week");
                break; 
            case "Friday":
                System.out.println("Friday is the Day 5 of the week");
                break;     
            case "Saturday":
                System.out.println("Saturday is the Day 6 of the week");
                break;   
            case "Sunday":
                System.out.println("Sunday is the Day 7 of the week");
                break; 
            default:
                System.out.println("Invalid Day");   
                break; 
            }
            sc.close();
    }
    
}
