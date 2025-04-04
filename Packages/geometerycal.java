import java.lang.*;
import java.util.Scanner;
import mypackage.geometery;
public class geometerycal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        geometery a1=new geometery();
        System.out.println("Enter the lenght of Rectangle");
        double lenght=input.nextDouble();
        System.out.println("Enter the Breath of Rectangle");
        double breath=input.nextDouble();
        System.out.println("Area of Rectangle");
       System.out.println(a1.areaRectangle(lenght, breath)); 
        System.out.println("Enter the radius of Circle");
        double radius=input.nextDouble();
        System.out.println("Area of Circle");
        System.out.println(a1.areaCircle(radius));
        System.out.println("Enter lenght of triangle");
        double tlength=input.nextDouble();
        System.out.println("Enter height of triangle");
        double height=input.nextDouble();
        System.out.println("Area of Triangle");
        System.out.println(a1.areaTriangle(tlength, height));


      
    }
    
}
