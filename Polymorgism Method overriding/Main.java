class Vehicle {
    void speed() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car moves at 80 km/h");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike moves at 60 km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();
        v.speed();
        v = new Bike();
        v.speed();
    }
}
