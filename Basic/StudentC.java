public class StudentC {
    String Name;
    int ID;
    String course;
    double fee;
    StudentC(){
    Name = "abc";
    ID = 15635;
    course ="python";
    fee = 50000.00;

    }
    StudentC(String N, int ID, String course, double fee){
        this.Name=N;              // this refers to the current object
        this.ID=ID;
        this.course=course;
        this.fee=fee;
        
    }
    StudentC(String Name){
        //constructor chaining                              // className("PreDefineVal")
        this(Name, 0, "Not assigned",0.0);  //this(PreDefinedVal, arg1, arg2, arg3); calling constructor with 4 arguments with in the class
    }
    StudentC(String Name,int ID, double fee){
        this(Name,ID,"not assigned",fee);

    }
    //copy constructor
    StudentC(StudentC A){      //ClassName(ClassName refCopy){                   
        this.Name=A.Name;      //  this.arg=refcopy.arg; } 
        this.ID=A.ID;
        this.course=A.course;
        this.fee=A.fee;

    }
    void ApplyDiscount(double amount){
        fee = fee - amount;

    }
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("ID: "+ID);
        System.out.println("Course: "+course);
        System.out.println("Fee: "+fee);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("-----Student details-----");
        StudentC A =new StudentC("Ashwith",141,"JAVA",50000.00);  //constructor with 4 args
        A.ApplyDiscount(1000);
        A.display();
        StudentC B =new StudentC("aaa",165153,50000.00);  //costructor with 3 arguments
        B.display();
        StudentC C =new StudentC("addygadv");  //constructor with 1 argument
        C.display();
        StudentC D =new StudentC();  //constructor with 0 arguments (Default constructor)
        D.display();
        StudentC E = new StudentC(A);  // to copy A arguments to E
        E.display();

    }
    
}
