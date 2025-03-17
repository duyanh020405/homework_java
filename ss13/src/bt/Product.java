package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements IAp {
    private static List<Product> products = new ArrayList<>();
    private String productId;
    private String name;
    private float importMoney;
    private float exportMoney;
    private String title;
    private String describe;
    private int quantity;
    private int idCategory;
    private int status;
    private static final float INTEREST = 1000.0f;

    @Override
    public void inputData(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter Product ID gồm có chữ E , T , C ở đầu  ");
        productId = scanner.nextLine().trim();

        System.out.print("Enter Product Name: ");
        name = scanner.nextLine().trim();

        System.out.print("Enter Import Money: ");
        importMoney = scanner.nextFloat();

        System.out.print("Enter Export Money: ");
        exportMoney = scanner.nextFloat();

        scanner.nextLine();
        System.out.print("Enter Title: ");
        title = scanner.nextLine().trim();

        System.out.print("Enter Description: ");
        describe = scanner.nextLine().trim();

        System.out.print("Enter Quantity: ");
        quantity = scanner.nextInt();

        System.out.print("Enter Category ID: ");
        idCategory = scanner.nextInt();

        System.out.print("Enter Status (1: Còn hàng, 2: Hết hàng, 3: Ngừng bán): ");
        status = scanner.nextInt();

        if (productId.matches("^[ECT].*") &&
                name.length() > 10 && name.length() < 100 &&
                title.length() < 200 &&
                importMoney > INTEREST &&
                exportMoney > importMoney * 1.3 &&
                (status == 1 || status == 2 || status == 3)) {
            products.add(this);
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Nhập lại");
        }
    }

    @Override
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Import Money: " + importMoney);
        System.out.println("Export Money: " + exportMoney);
        System.out.println("Title: " + title);
        System.out.println("Description: " + describe);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category ID: " + idCategory);
        System.out.println("Status: " + (status == 1 ? "Còn hàng" : status == 2 ? "Hết hàng" : "Ngừng kinh doanh"));
    }

    public static void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            for (Product product : products) {
                product.display();
            }
        }
    }
    public static void searchByNameOrTitle(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên hoặc tiêu đề sản phẩm: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Product product : products) {
            if (product.name.toLowerCase().contains(keyword) || product.title.toLowerCase().contains(keyword)) {
                product.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩmddod");
        }
    }

    public static void searchByPriceRange(Scanner scanner) {
        System.out.print("Nhập giá thấp nhất: ");
        float minPrice = scanner.nextFloat();
        System.out.print("Nhập giá cao nhất: ");
        float maxPrice = scanner.nextFloat();

        for (Product product : products) {
            if (product.exportMoney >= minPrice && product.exportMoney <= maxPrice) {
                product.display();
            }
        }
    }
    public static void sortByPrice() {
        products.sort((p1, p2) -> Float.compare(p1.exportMoney, p2.exportMoney));
        System.out.println("Sắp xeeaps thành công");
    }
    public static void sellProduct(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập ID sản phẩm cần bán: ");
        String id = scanner.nextLine();
        System.out.print("Nhập số lượng bán: ");
        int sellQuantity = scanner.nextInt();

        for (Product product : products) {
            if (product.productId.equals(id)) {
                if (product.quantity >= sellQuantity) {
                    product.quantity -= sellQuantity;
                    System.out.println("Bán thành công , còn  " + product.quantity);
                } else {
                    System.out.println("Không đủ để bán");
                }
                return;
            }
        }
        System.out.println("Khoong tìm thấy sp đó");
    }

    public static void updateProduct(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();

        for (Product product : products) {
            if (product.productId.equals(id)) {
                System.out.println("Cập nhật thông tin sản phẩm: " + product.name);

                System.out.print("Nhập tên mới (Enter để giữ nguyên): ");
                String newName = scanner.nextLine().trim();
                if (!newName.isEmpty()) product.name = newName;

                System.out.print("Nhập giá nhập mới (-1 để giữ nguyên): ");
                float newImportMoney = scanner.nextFloat();
                if (newImportMoney >= 0) product.importMoney = newImportMoney;

                System.out.print("Nhập giá bán mới (-1 để giữ nguyên): ");
                float newExportMoney = scanner.nextFloat();
                if (newExportMoney >= 0) product.exportMoney = newExportMoney;

                scanner.nextLine(); // Fix lỗi trôi dòng
                System.out.print("Nhập tiêu đề mới (Enter để giữ nguyên): ");
                String newTitle = scanner.nextLine().trim();
                if (!newTitle.isEmpty()) product.title = newTitle;

                System.out.print("Nhập mô tả mới (Enter để giữ nguyên): ");
                String newDescribe = scanner.nextLine().trim();
                if (!newDescribe.isEmpty()) product.describe = newDescribe;

                System.out.print("Nhập số lượng mới (-1 để giữ nguyên): ");
                int newQuantity = scanner.nextInt();
                if (newQuantity >= 0) product.quantity = newQuantity;

                System.out.print("Nhập trạng thái mới (1: Còn hàng, 2: Hết hàng, 3: Ngừng kinh doanh): ");
                int newStatus = scanner.nextInt();
                if (newStatus >= 1 && newStatus <= 3) product.status = newStatus;

                System.out.println(" Sản phẩm đã được cập nhật thành công!");
                return;
            }
        }
        System.out.println(" Không tìm thấy sản phẩm có ID: " + id);
    }

    public static void deleteProduct(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        String id = scanner.nextLine();

        for (Product product : products) {
            if (product.productId.equals(id)) {
                System.out.print(" Bạn có chắc chắn muốn xóa sản phẩm này? yes or no: ");
                String confirm = scanner.nextLine().trim().toLowerCase();
                if (confirm.equals("yes")) {
                    products.remove(product);
                    System.out.println(" Sản phẩm đã được xóa thành công!");
                } else {
                    System.out.println(" Hủy xóa sản phẩm.");
                }
                return;
            }
        }
        System.out.println(" Không tìm thấy sản phẩm có ID: " + id);
    }

}
