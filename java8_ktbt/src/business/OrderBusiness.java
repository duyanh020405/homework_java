package business;

import entity.Customer;
import entity.Order;
import presentation.ShopManagement;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static presentation.ShopManagement.orders;

public  class OrderBusiness implements IOrderBusiness{
    @Override
    public void addOrder(Scanner scanner) {
        System.out.println("Nhap so don hang :");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            Order order = new Order();
            order.inputData(scanner);
            orders.add(order);
        }

    }

    @Override
    public void displayOrders() {
        for(Order order : orders){
            System.out.println(order.toString());
        }

    }

    @Override
    public void updateOrderStatus(Scanner scanner) {
        for(Customer cus : ShopManagement.customers){
            System.out.println("Nhap id don hang muon update :");
            int id = scanner.nextInt();
            boolean find = false;
            for(Order order : orders){
                if(order.getId() == id){
                    find = true;
                    order.setStatus(!order.isStatus());
                    System.out.println("Cap nhat trang thai thanh cong tu "+!order.isStatus()+"->"+order.isStatus());
                }
            }
            if(!find){
                System.out.println("Khong tim thay don hang nay!");
                break;

            }
        }
    }

    @Override
    public List<Order> getOrderOverdue() {
        return orders.stream().filter(o->!o.isStatus() && o.getOrderDate().isBefore(LocalDate.now())).toList();
    }

    @Override
    public double getTotalRevenue() {
        int total = 0;
       List<Order> shipped = orders.stream().filter(o->o.isStatus() ==true).toList();
        for (Order order : shipped) {
            total+=order.getTotalAmount();
        }
        return total;
    }
}
