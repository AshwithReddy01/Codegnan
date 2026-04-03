class student{

    //instance variable
    int rollNo;
    String name;
    int age;
    String course;
    public static void main(String[] args) {
        //Syntax to create an object
        //Classname objreference = new classname()
        student studentRef = new student();

        //Initializing student values - values to students
        studentRef.name = "Ashwith Reddy";
        studentRef.rollNo = 141;
        studentRef.age = 21;
        studentRef.course = "Full stack"; 

        //Printing all the values initialized
        System.out.println(studentRef.name);
        System.out.println(studentRef.rollNo);
        System.out.println(studentRef.age);
        System.out.println(studentRef.course);
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNo);
        System.out.println(course);
    }

    
}
