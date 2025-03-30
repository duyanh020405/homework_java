package bt8;

import java.io.*;
import java.util.*;


public class bt8 {
    public static void main(String[] args) throws Exception {
        String file = "products.dat";
        List<Product> products = List.of(
                new Product(1, "Laptop", 1500.99),
                new Product(2, "Chuột", 250.5),
                new Product(3, "Bàn phím", 500.75)
        );

        try (var oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(products);
        }

        try (var ois = new ObjectInputStream(new FileInputStream(file))) {
            ((List<Product>) ois.readObject()).forEach(System.out::println);
        }
    }
}

