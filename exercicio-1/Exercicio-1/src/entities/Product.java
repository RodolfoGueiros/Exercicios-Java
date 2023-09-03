package entities;

import static java.lang.String.format;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $" + format("%.2f", price) + ", " + quantity + " units, Total: $" + format("%.2f", totalValueInStock());
    }
}
