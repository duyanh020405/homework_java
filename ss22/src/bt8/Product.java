package bt8;

import java.io.Serializable;

class Product implements Serializable {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("ID: %d | Tên: %s | Giá: %.2f", id, name, price);
    }
}
