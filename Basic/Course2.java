// polymorphism: Multiple forms of a constructor
public class Course2 {
	String courseName;
	double courseFee;
	int courseDuration;
    Course2(){
        System.out.println("Object created"); // Without arguments
    }
   Course2(String N, double F, int D){   //Parameterized constructor (Overloaded constructor: multiple data types )
    courseName=N;
    courseFee=F;
    courseDuration=D;
   }
   Course2(String  A, double Z){
    courseName = A;
    courseFee = Z;
   }
   Course2(String B){
    courseName = B;
   }
   public void display(Course2 c){
        System.out.println("Course name: "+c.courseName);
        System.out.println("Course Fee: "+c.courseFee);
        System.out.println("Course Duration: "+c.courseDuration);
        System.out.println();
   }
    public static void main(String[] args) {
        Course2 course = new Course2("Java",50000.00,100);
        course.display(course); 
        

        Course2 course1 = new Course2("Java",50000.00);
        course1.display(course1);
        

        

    }

}

    

