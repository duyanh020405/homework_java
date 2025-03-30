package bt9;

import java.io.Serializable;

class Book implements Serializable {
    int id;
    String name, author, publisher;
    double price;

    public Book(int id, String name, String author, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String toString() {
        return String.format("ID: %d | %s | %s | %s | %.2f", id, name, author, publisher, price);
    }
}