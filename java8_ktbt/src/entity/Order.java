package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

import static presentation.ShopManagement.customers;

public class Order implements IApp {

    int auto = 0 ;
    int id ;
    Customer customer ;
    LocalDate orderDate ;
    double totalAmount ;
    boolean status ;
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Order() {
        this.id = ++auto;
    }


    @Override
    public void inputData(Scanner scanner) {
        this.id = ++auto;
        boolean find = false ;
        System.out.println("Nhap id customer : ");
        int id = scanner.nextInt();
        for (Customer customer : customers ) {
            if (customer.getId() == id) {
                this.customer = customer;
                find = true ;
                System.out.println("Thanh cong nhan thong tin customer !");
            }

        }
        if (!find) {
            System.out.println("Khong tim thay customer ");
        }

        this.orderDate = inputOrderDate(scanner);



        System.out.println("Tong tien don hang  : ");
        this.totalAmount = scanner.nextDouble();
        this.status = false ;
    }
    private LocalDate inputOrderDate(Scanner scanner) {
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.print("Nhập ngày nhận hàng (dd/MM/yyyy): ");
            String dateInput = scanner.nextLine().trim();

            if (dateInput.isEmpty()) {
                System.out.println(" Lỗi! Ngày không được để trống.");
                continue;
            }

            try {
                return LocalDate.parse(dateInput, DTF);
            } catch (Exception err) {
                System.out.println(" Lỗi! Định dạng ngày không hợp lệ. Vui lòng nhập theo dd/MM/yyyy.");
            }
        }
    }

    public Order(boolean status, double totalAmount, LocalDate orderDate, Customer customer, int id) {
        this.status = status;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.customer = customer;
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return id + " " + customer.getName() + " " + orderDate + " " + totalAmount;
    }
}
