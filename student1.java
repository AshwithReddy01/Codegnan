class student1{

    //instance variable
    int rollNo;
    String name;
    int age;
    String course;
    public static void main(String[] args) {
        //Syntax to create an object
        //Classname objreference = new classname()
        student1 studentRef = new student1();

        //Initializing student values - values to students
        studentRef.name = "Ashwith Reddy";
        studentRef.rollNo = 141;
        studentRef.age = 21;
        studentRef.course = "Full stack"; 
        studentRef.display();
        student1 studentRef1 =new student1();
        studentRef1.name="abd";
        studentRef1.rollNo=148;
        studentRef1.age=21;
        studentRef1.course="python";
        studentRef1.display();
        
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNo);
        System.out.println(course);
        System.out.println();
    }
}