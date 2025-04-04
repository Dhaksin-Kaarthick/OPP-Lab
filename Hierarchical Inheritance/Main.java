class Vehicle {
    private String brand;
    private String model;
     public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void start() {
        System.out.println("Vehicle is starting.");
    }
    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
    public String getBrand() {
        return brand;
    }
  public String getModel() {
        return model;
    }
}
class Car extends Vehicle {
    private int numberOfDoors ;
   public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
  public void drive() {
        System.out.println("Car is driving.");
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
class ElectricCar extends Car {
    private int batteryCapacity;
   public ElectricCar(String brand, String model, int numberOfDoors, int batteryCapacity) {
        super(brand, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }
  public void charge() {
        System.out.println("Electric car is charging.");
    }
 public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
class Truck extends Vehicle {
    private double cargoCapacity;
    public Truck(String brand, String model, double cargoCapacity) {
        super(brand, model);
        this.cargoCapacity = cargoCapacity;
    }
 public void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
  public double getCargoCapacity() {
        return cargoCapacity;
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        car.start();
        car.drive();
        car.stop();
        System.out.println("Car doors: " + car.getNumberOfDoors());
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 4, 100);
        electricCar.start();
        electricCar.drive();
        electricCar.charge();
        System.out.println("Battery capacity: " + electricCar.getBatteryCapacity());
        Truck truck = new Truck("Ford", "F-150", 2000.5);
        truck.start();
        truck.loadCargo();
        truck.stop();
        System.out.println("Cargo capacity: " + truck.getCargoCapacity());
    }
}
