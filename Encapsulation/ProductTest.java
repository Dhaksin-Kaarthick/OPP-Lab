class Product {
    private String productName;
    private double price;
    private int stock;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }

    public void setStock(int stock) {
        this.stock = stock >= 0 ? stock : 0;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductName("Laptop");
        product.setPrice(1200);
        product.setStock(5);

        System.out.println("Product: " + product.getProductName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Available: " + (product.isAvailable() ? "In Stock" : "Out of Stock"));
    }
}