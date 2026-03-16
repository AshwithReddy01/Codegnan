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
        studentRef.age = 21;
        studentRef.name = "Ashwith Reddy";
        studentRef.course = "Full stack"; 
        studentRef.rollNo = 141;
        //Printing all the values initialized
        System.out.println(studentRef.name);
        System.out.println(studentRef.rollNo);
        System.out.println(studentRef.age);
        System.out.println(studentRef.course);
    }

    
}
