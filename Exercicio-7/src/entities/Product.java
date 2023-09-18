package entities;

import static java.lang.String.format;

public class Product {
    public String name;
    public double price;
    public int quantity;


    //metodo construtor com sobrecarga visando oferecer mais de uma operação
    // Com mesmo nome, mas parâmetros diferentes

    public Product() { //construtor padrao
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { //construtor sem a quantidade
        this.name = name;
        this.price = price;
    }
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
        return name
                + ", $"
                + format("%.2f", price)
                + ", " + quantity
                + " units, Total: $"
                + format("%.2f", totalValueInStock());
    }

}
