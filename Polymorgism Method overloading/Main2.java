class Shape {
    void draw(double radius) {
        System.out.println("Drawing a circle with radius: " + radius);
    }
 void draw(double length, double width) {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }
    void draw(double side1, double side2, double side3) {
        System.out.println("Drawing a triangle with sides: " + side1 + ", " + side2 + ", " + side3);
    }
}
public class  Main2{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw(5.0); 
        shape.draw(4.0, 6.0); 
        shape.draw(3.0, 4.0, 5.0);     }
}
