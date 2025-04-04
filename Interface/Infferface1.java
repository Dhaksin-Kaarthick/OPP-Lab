interface Shape{
void getArea();
}
class Rectangle implements Shape{
    double lenght,breadth;

    Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }
    public void getArea(){
       System.out.println("The area of rectangle "+(lenght*breadth)); 
    }
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void getArea(){
        System.out.println("The are of circle is "+(3.14*(radius*radius)));
    }
}
public class Infferface1 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(12, 12);
        r1.getArea();
        Circle c1=new Circle(4);
        c1.getArea();
    }
    
}
