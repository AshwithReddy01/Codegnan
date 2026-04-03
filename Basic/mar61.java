import java.util.*;
class operations{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Student Name: ");
    String s = sc.nextLine();
    System.out.print("Enter Student Age: ");
    int n = sc.nextInt();
    System.out.print("Enter Student Grade: ");
    char c = sc.next().charAt(0);
    System.out.print("Enter student marks: ");
    double m= sc.nextDouble();
    System.out.print("Enter if student is passed: ");
    boolean b = sc.nextBoolean();
    System.out.println(" ");
    System.out.println("--- STUDENT DETAILS ---");
    System.out.println("Student Name: "+s);
    System.out.println("Age: "+n);
    System.out.println("Grade: "+c);
    System.out.println("Marks: "+m);
    System.out.println("Is Passed: "+b);

    sc.close();

  }
}