abstract class Shape {
    // Abstract method to calculate the area
    abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side; // Area of square: side²
    }
}
public class Main3 {
    public static void main(String[] args) {
        Shape square = new Square(4.0);
        System.out.println("Area of the square: " + square.calculateArea());
    }
}