package bt10;

import static bt10.main.products;

public class Product {
    String id ;
    String name ;
    double price;
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}
