class Car {
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        if (speed > 200) {
            this.speed = 200;
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

public class a {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Tesla");
        car.setSpeed(250);
        System.out.println("Car: " + car.getBrand() + ", Speed: " + car.getSpeed() + " km/h");
    }
}
