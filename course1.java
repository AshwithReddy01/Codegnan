public class course1 {
    int courseId;
    String courseName;
    int courseDuration;
    public static void main(String[] args) {
        course1 courseref= new course1();
        courseref.courseId=100;
        courseref.courseName ="Java";
        courseref.courseDuration = 100;

        courseref.display();
        course1 courseref1 =new course1();
        courseref1.courseId = 101;
        courseref1.courseName="Python";
        courseref1.courseDuration=100;
        courseref1.display();
    } 
    /*syntax to create a method:
    accesmodifier returntype methodname(optional arguments){
    accessmodifier:public,private,protected,default.
    method body
    } */
    // Example:

   public void display(){
    System.out.println(courseName);
    System.out.println(courseId);
    System.out.println(courseDuration);
    System.out.println();
    

   }
    
}

    

