abstract class Vehicle{
abstract void start(String name);

abstract void stop(String name);

}
class Car extends Vehicle{
void start(String name){
System.out.println( name+" is Starting");
}
void stop(String name){
System.out.println(name+" is stopping");
}
}
class Bike extends Vehicle{
void start(String name){
System.out.println( name+" is Starting");
}
void stop(String name){
System.out.println(name+" is stopping");
}
}
public class Main2{
public static void main(String[] args){
Car v1=new Car();

 v1.start("Lambo");
 v1.stop("lambo");

Bike v2=new Bike();
 v2.start("Ducati");
 v2.stop("Ducati");
}
}
