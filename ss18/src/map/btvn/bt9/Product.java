package map.btvn.bt9;

import java.util.Map;
import java.util.Scanner;

public class Product {
    int id;
    String name;
    float price;
    int quantity;

    public Product(int id, String name, float price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static Product addProduct(Scanner sc) {
        System.out.println("Nhap id (la so) :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten san pham :");
        String name = sc.nextLine().trim();
        System.out.println("Nhap gia san pham :");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap so luong san pham :");
        int quantity = Integer.parseInt(sc.nextLine());

        if (id > 0 && !name.isEmpty() && price > 0 && quantity > 0) {
            return new Product(id, name, price, quantity);
        }
        return null;
    }

    public static Product updateProduct(Scanner sc , int id ,  Map<Integer, Product> products) {
        for (Product product : products.values()) {
            if (product.id == id) {
                product.name = sc.nextLine().trim();
                product.price = Float.parseFloat(sc.nextLine());
                product.quantity = Integer.parseInt(sc.nextLine());
                return product;
            }
        }

        return null;
    }

    public static Product deleteProduct(Map<Integer,Product> products , int id) {
        boolean flag = false;
        for (Product product : products.values()) {
            if (product.id == id) {
                products.remove(id);
                System.out.println("Xoa thanh cong:");
                 flag = true;
                return product;
            }
        }
        if (!flag) {
            System.out.println("Khong tim thay san pham");
        }
        return null;
    }

}
