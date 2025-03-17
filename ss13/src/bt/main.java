package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        List<Categories> categories = new ArrayList<>();

        do {
            System.out.println("********************* MAIN MENU *********************");
            System.out.println("1. Chọn SHOP MENU");
            System.out.println("2. chọn PRODUCT MANAGEMENT");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    boolean shopFlag = true;
                    while (shopFlag) {
                        System.out.println("********************* SHOP MENU *********************");
                        System.out.println("1. Quản lý danh mục");
                        System.out.println("2. Quay lại MENU chính");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                boolean categoryFlag = true;
                                while (categoryFlag) {
                                    System.out.println("******************** CATEGORIE MANAGEMENT *********************");
                                    System.out.println("1. Danh sách danh mục");
                                    System.out.println("2. Thêm mới danh mục");
                                    System.out.println("3. Cập nhật danh mục");
                                    System.out.println("4. Xóa danh mục");
                                    System.out.println("5. Tìm kiếm danh mục theo tên");
                                    System.out.println("6. Quay lại SHOP MENU");
                                    System.out.print("Nhập lựa chọn của bạn: ");
                                    choice = scanner.nextInt();

                                    switch (choice) {
                                        case 1:
                                            System.out.println("Hiển thị danh sách danh mục:");
                                            if (categories.isEmpty()) {
                                                System.out.println("Danh sách danh mục trống.");
                                            } else {
                                                for (Categories category : categories) {
                                                    category.display();
                                                }
                                            }
                                            break;

                                        case 2:
                                            System.out.println("Thêm mới danh mục");
                                            Categories newCategory = Categories.inputData(scanner);
                                            if (newCategory != null) {
                                                categories.add(newCategory);
                                                System.out.println("Danh mục đã được thêm thành công!");
                                            } else {
                                                System.out.println("Không thể thêm danh mục. Dữ liệu không hợp lệ.");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("Cập nhật danh mục");
                                            System.out.print("Nhập ID danh mục cần cập nhật: ");
                                            int idUpdate = scanner.nextInt();
                                            scanner.nextLine();
                                            boolean found = false;

                                            for (Categories category : categories) {
                                                if (category.getCategory_id() == idUpdate) {
                                                    System.out.print("Nhập tên mới: ");
                                                    String name = scanner.nextLine();
                                                    System.out.print("Nhập mô tả mới: ");
                                                    String description = scanner.nextLine();
                                                    System.out.print("Nhập trạng thái (true/false): ");
                                                    boolean status = scanner.nextBoolean();

                                                    category.setCategory_name(name);
                                                    category.setDescribe(description);
                                                    category.setStatus(status);

                                                    System.out.println("Đã cập nhật danh mục thành công!");
                                                    found = true;
                                                    break;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("Không tìm thấy danh mục có ID: " + idUpdate);
                                            }
                                            break;

                                        case 4:
                                            System.out.println("Xóa danh mục");
                                            System.out.print("Nhập ID danh mục cần xóa: ");
                                            int idDelete = scanner.nextInt();
                                            categories.removeIf(category -> category.getCategory_id() == idDelete);
                                            System.out.println("Danh mục đã được xóa!");
                                            break;

                                        case 5:
                                            System.out.println("Tìm kiếm danh mục");
                                            System.out.print("Nhập tên danh mục cần tìm: ");
                                            scanner.nextLine();
                                            String searchName = scanner.nextLine().toLowerCase();
                                            boolean isFound = false;

                                            for (Categories category : categories) {
                                                if (category.getCategory_name().toLowerCase().contains(searchName)) {
                                                    category.display();
                                                    isFound = true;
                                                }
                                            }
                                            if (!isFound) {
                                                System.out.println("Khong tim thay");
                                            }
                                            break;

                                        case 6:
                                            categoryFlag = false;
                                            break;

                                        default:
                                            System.out.println("CHon lai");
                                    }
                                }
                                break;

                            case 2:
                                shopFlag = false;
                                break;

                            default:
                                System.out.println("Chonlai");
                        }
                    }
                    break;
                case 2:
                    boolean productFlag = true;
                    while (productFlag) {
                        System.out.println("******************** PRODUCT MANAGEMENT *********************");
                        System.out.println("1. Danh sách sản phẩm");
                        System.out.println("2. Thêm mới sản phẩm");
                        System.out.println("3. Cập nhật sản phẩm");
                        System.out.println("4. Xóa sản phẩm");
                        System.out.println("5. Tìm kiếm sản phẩm theo tên hoặc tiêu đề");
                        System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá bán");
                        System.out.println("7. Sắp xếp sản phẩm theo giá bán tăng dần");
                        System.out.println("8. Bán sản phẩm");
                        System.out.println("9. Thống kê số lượng sản phẩm theo danh mục");
                        System.out.println("10. Thoát");
                        System.out.print("Nhập lựa chọn của bạn: ");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                Product.displayAll();
                                break;

                            case 2:
                                Product newProduct = new Product();
                                newProduct.inputData(scanner);
                                break;

                            case 3:
                                Product.updateProduct(scanner);
                                break;

                            case 4:
                                Product.deleteProduct(scanner);
                                break;

                            case 5:
                                Product.searchByNameOrTitle(scanner);
                                break;

                            case 6:
                                Product.searchByPriceRange(scanner);
                                break;

                            case 7:
                                Product.sortByPrice();
                                break;

                            case 8:
                                Product.sellProduct(scanner);
                                break;

                            case 9:
                                System.out.println("Chức năng thống kê sản phẩm theo danh mục đang phát triển...");
                                break;

                            case 10:
                                productFlag = false;
                                break;

                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
                        }
                    }
                    break;


                default:
                    System.out.println("Chon lai");
            }
        } while (flag);

        scanner.close();
    }
}
