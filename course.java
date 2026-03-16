public class course {
    int courseId;
    String courseName;
    int courseDuration;
    public static void main(String[] args) {
        course courseref= new course();
        courseref.courseId=100;
        courseref.courseName ="Java";
        courseref.courseDuration = 100;

        System.out.println(courseref.courseId);
        System.out.println(courseref.courseName);
        System.out.println(courseref.courseDuration);
        System.out.println();

        course courseref1 =new course();
        courseref1.courseId = 101;
        courseref1.courseName="Python";
        courseref1.courseDuration=100;

        System.out.println(courseref1.courseId);
        System.out.println(courseref1.courseName);
        System.out.println(courseref1.courseDuration);
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
    

   }
    
}
