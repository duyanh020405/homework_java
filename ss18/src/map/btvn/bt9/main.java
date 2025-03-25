package map.btvn.bt9;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean on = true;
        do{
        System.out.println("---------------Menu-------------");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("5. All_quantity");
        System.out.println("6. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Product product = Product.addProduct(scanner);
                if (product != null) {
                    products.put(product.id, product);
                    System.out.println("San pham da duoc them!");
                } else {
                    System.out.println("Thong tin san pham khong hop le.");
                }
                break;
            case 2:
                System.out.println("Nhap id de cap nhat!");
                int id = scanner.nextInt();
                Product.updateProduct(scanner,id,products);
                break;
            case 3:
                System.out.println("Nhap id san pham :");
                int id_delete = scanner.nextInt();
                Product.deleteProduct(products,id_delete);
                break;
            case 4:
                float sum = 0;
                for(Map.Entry<Integer, Product> entry : products.entrySet()) {
                    sum +=entry.getValue().quantity * entry.getValue().price;
                }
                System.out.println("Tong gia trr kho :"+sum);
                break;
            case 5:
                System.out.println("Chuong trinh ket thuc");
                on = false;
            case 6 :
                System.exit(0);
                on = false;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }
        while (on);
}
}
