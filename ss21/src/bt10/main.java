package bt10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static List<Product>  products = new ArrayList<Product>();
    public static void main(String[] args) throws Exception {
        products.add(new Product("P001", "Laptop Dell XPS", 1800.0));
        products.add(new Product("P002", "MacBook Pro 16\"", 2500.0));
        products.add(new Product("P003", "iPhone 14 Pro Max", 1300.0));
        products.add(new Product("P004", "Samsung Galaxy S23", 1100.0));
        products.add(new Product("P005", "Tai nghe Sony WH-1000XM5", 400.0));
        products.add(new Product("P006", "Bàn phím cơ Keychron K6", 120.0));
        products.add(new Product("P007", "Chuột gaming Logitech G502", 80.0));
        products.add(new Product("P008", "Màn hình LG UltraGear 27\"", 450.0));
        products.add(new Product("P009", "Ổ cứng SSD Samsung 1TB", 150.0));
        products.add(new Product("P010", "Ghế công thái học Sihoo M90C", 300.0));
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("--------- Menu -----------");
            System.out.println("1. Xem danh sách sản phẩm có sẵn");
            System.out.println("2. Thêm sản phẩm vào giỏ hàng");
            System.out.println("3. Xóa sản phẩm khỏi giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Hiển thị tổng tiền ");
            System.out.println("6. Thoat!!");
            System.out.println("CHon di :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    if(products.isEmpty()){
                        System.out.println("Khong co danh sach san pham nao!!");
                        break;
                    }else {
                        for (int i = 0; i < products.size(); i++) {
                            products.get(i).display();
                        }break;
                    }
                case 2 :
                    sc.nextLine();
                    System.out.println("Nhap id cua san pham :");
                    String id = sc.nextLine();
                    System.out.println("nhap so luong :");
                    int quantity = sc.nextInt();
                    for (Product item : products) {
                        if (item.id.equals(id)) {
                            if(quantity > 0){
                                ShoppingCart.addToCart(item,quantity);
                            }
                        }
                    }
                   ;
                    break;
                case 3 :
                    sc.nextLine();
                    System.out.println("Nhap id cua san pham :");
                    String id_remove  = sc.nextLine();
                    ShoppingCart.removeFromCart(id_remove);
                    break;
                case 4 :
                    sc.nextLine();
                    ShoppingCart.displayCart();
                    break;
                case 5 :
                    sc.nextLine();
                    ShoppingCart.checkout();
                    break;
                case 6 :
                    sc.nextLine();
                    System.exit(0);
                    break;
                default :
                    System.out.println("Xin hay chon dung so !!");
                    break;

            }


        }while(true);

    }
}
