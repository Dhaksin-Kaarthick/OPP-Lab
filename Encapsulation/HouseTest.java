class House {
    private String location;
    private double area;  // in square meters
    private double pricePerSquareMeter;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setArea(double area) {
        this.area = area > 0 ? area : 0;
    }

    public void setPricePerSquareMeter(double price) {
        this.pricePerSquareMeter = price > 0 ? price : 0;
    }

    public String getLocation() {
        return location;
    }

    public double getTotalPrice() {
        return area * pricePerSquareMeter;
    }
}

public class HouseTest {
    public static void main(String[] args) {
        House house = new House();
        house.setLocation("Downtown");
        house.setArea(200);
        house.setPricePerSquareMeter(1500);

        System.out.println("House Location: " + house.getLocation());
        System.out.println("Total Price: $" + house.getTotalPrice());
    }
}