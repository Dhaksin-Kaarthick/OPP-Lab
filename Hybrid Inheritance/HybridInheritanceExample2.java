class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}
class Boat extends Vehicle {
    void sail() {
        System.out.println("Boat is sailing.");
    }
}
interface Amphibious {
    void switchMode();
}
class AmphibiousCar extends Car implements Amphibious {
    public void switchMode() {
        System.out.println("Switching between land and water mode.");
    }
 
    void sail() {
        System.out.println("Amphibious car is sailing on water.");
    }
}
public class HybridInheritanceExample2 {
    public static void main(String[] args) {
        AmphibiousCar ac = new AmphibiousCar();
        ac.startEngine();
        ac.drive();
        ac.switchMode();
        ac.sail();
    }
}
