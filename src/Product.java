public class Product {
    String name;
    double price;
    boolean inStock;
    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String toString() {
        return name + " - $" + price + " - In stock: " + inStock;
    }
}