package btvn.bt9;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.0));
        products.add(new Product("Smartphone", 900.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Keyboard", 80.0));
        products.add(new Product("USB Cable", 20.0));

        ProductProcessor processor = new ProductProcessorImpl();


        List<Product> expensiveProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() > 100) {
                expensiveProducts.add(p);
            }
        }


        if (!expensiveProducts.isEmpty()) {
            System.out.println("Các sản phẩm có giá > 100:");
            ProductProcessor.printProductList(expensiveProducts);
        } else {
            System.out.println("Không có sản phẩm đắt tiền");
        }

        /
        double totalValue = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị sản phẩm: " + totalValue);


        System.out.println("\nDanh sách sản phẩm:");
        ProductProcessor.printProductList(products);
    }
}
