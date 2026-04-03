
public class Calculator {
    public void AddNumbers(int num1,int num2,int num3)
    {
        int result = num1 + num2+ num3;
        System.out.println("Result: "+result);
    }
    public void AddNumbers(int num1 , int num2){
        int result= num1+ num2;
        System.out.println("REsult: "+result);
    }
    public void AddNumbers(int num)
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.AddNumbers(100,200,300);

    }
    
}
