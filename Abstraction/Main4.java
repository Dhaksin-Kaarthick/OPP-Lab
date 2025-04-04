abstract class Shape2D{
abstract void draw();
abstract void resize();
}
class Rectangle extends Shape2D{
void draw(){
System.out.println("you are Drawing Rectangle");
}
void resize(){
System.out.println("you can resize the lenght and breadth of rectangle");
}
}
class Circle extends Shape2D{
void draw(){
System.out.println("you are Drawing Circle");
}
void resize(){
System.out.println("you can resize the Radius of circle ");
}
}
public class Main4{
public static void main(String[] args){
Shape2D s1=new Rectangle();
s1.draw();
s1.resize();

Shape2D s2=new Circle();
s2.draw();
s2.resize();

}
}