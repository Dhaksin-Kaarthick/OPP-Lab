interface Vehicle{
    void start();
    void stop();
}
interface ElectricVehicle{
    void chargeBattery();
}
interface FuelVehicle{
    void refuel();
}
class HybridCar implements Vehicle,ElectricVehicle,FuelVehicle{
    public void start(){
        System.out.println("Vehicle Started ");
    }
    public void stop(){
        System.out.println("Vehicle Stoped ");
    }

    public void chargeBattery(){
        System.out.println("Vehicle charging battery ");
    }

    public void refuel(){
        System.out.println("Vehicle refilling the fuel tank ");
    }

}
public class Infferface4 {
    public static void main(String[] args) {
        HybridCar v1=new HybridCar();
        v1.chargeBattery();
        v1.start();
        v1.stop();
        v1.refuel();
    }
}
