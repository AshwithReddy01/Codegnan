public class Shape {
    public void area(int side){
        int result = side*side;
        System.out.println("Area of square: "+result);
    }
    public void area(int length, int breadth){
        int result = length * breadth;
        System.out.println("Area of rectangle: "+result);
    }
    public void area(double radius){
        double result = 3.14 * (radius * radius);
        System.out.println("Area of circle: "+ result);

    }
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(10);
        s.area(5,6);
        s.area(5.0);
    }
    
}
