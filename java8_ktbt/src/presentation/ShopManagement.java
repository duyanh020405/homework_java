package presentation;

import business.CustomerBusiness;
import business.OrderBusiness;
import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    public static List<Customer> customers = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    static OrderBusiness orderBusiness = new OrderBusiness();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("********************** SHOP MENU **********************");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    boolean customerMenu = true;
                    while (customerMenu) {
                        System.out.println("******************** CUSTOMER MENU ********************");
                        System.out.println("1. Danh sách khách hàng");
                        System.out.println("2. Thêm mới khách hàng");
                        System.out.println("3. Thoát");
                        System.out.print("Chọn chức năng: ");
                        int choice_c = scanner.nextInt();

                        switch (choice_c) {
                            case 1:
                                if (customers.isEmpty()) {
                                    System.out.println("Không có khách hàng để hiển thị.");
                                } else {
                                    for (Customer customer : customers) {
                                        System.out.println(customer);
                                    }
                                }
                                break;
                            case 2:
                                CustomerBusiness.addCustomer(scanner);
                                break;
                            case 3:
                                customerMenu = false;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                        }
                    }
                    break;

                case 2:
                    boolean orderMenu = true;
                    while (orderMenu) {
                        System.out.println("******************** ORDER MENU ********************");
                        System.out.println("1. Danh sách đơn hàng");
                        System.out.println("2. Thêm mới đơn hàng");
                        System.out.println("3. Cập nhật trạng thái đơn hàng");
                        System.out.println("4. Danh sách đơn hàng quá hạn");
                        System.out.println("5. Thống kê số lượng đơn hàng đã giao (Trạng thái true)");
                        System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao");
                        System.out.println("7. Thoát");
                        System.out.print("Chọn chức năng: ");
                        int choice_o = scanner.nextInt();

                        switch (choice_o) {
                            case 1:
                                if (orders.isEmpty()) {
                                    System.out.println("Không có đơn hàng để hiển thị.");
                                } else {
                                    for (Order order : orders) {
                                        System.out.println(order);
                                    }
                                }
                                break;
                            case 2:
                                orderBusiness.addOrder(scanner);
                                break;
                            case 3:
                                orderBusiness.updateOrderStatus(scanner);
                                break;
                            case 4:
                                orderBusiness.getOrderOverdue();
                                break;
                            case 5:
                                List<Order> shipped = orders.stream().filter(o->o.isStatus() ==true).toList();
                                for (Order order : shipped) {
                                    System.out.println(order.toString());
                                }
                                break;
                            case 6:
                               double sum = orderBusiness.getTotalRevenue();
                               System.out.println("tổng doanh thu các đơn hàng đã giao :"+sum);
                                break;
                            case 7:
                                orderMenu = false;
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                        }
                    }
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
        scanner.close();
    }
}
