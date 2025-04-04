public class Main{
public static void main(String[] args){
Car c1=new Lam();
c1.carName("lambogini");
c1.carSpeed(122,"lambogini");
}
}

abstract class Car{
abstract void carName(String name);

abstract void carSpeed(int speed,String name);

abstract void Mileage(int fuel,double mileage);

}
class Lam extends Car{
void carName(String name){
System.out.println("Your Car name is "+name);
}
void carSpeed(int speed,String name){
System.out.println(name+" can travel at the speed of "+speed+" km/h");
}
void Mileage(int fuel,double mileage){
System.out.println("lam "+"can travel range of "+(fuel*mileage));
}

}
