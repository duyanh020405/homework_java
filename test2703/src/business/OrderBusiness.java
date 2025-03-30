package business;

import entity.Order;
import presentation.ShopManagement;

import java.util.List;
import java.util.Scanner;

public class OrderBusiness implements IOrderBusiness{
    @Override
    public void addOrder(Scanner scanner) {

    }

    @Override
    public void displayOrders() {

    }

    @Override
    public void updateOrderStatus(Scanner scanner) {
        ShopManagement.l

    }

    @Override
    public List<Order> getOrderOverdue() {
        return List.of();
    }

    @Override
    public List<Order> getOrderDelivied() {
        return List.of();
    }

    @Override
    public double getTotalRevenue(List<Order> orders) {
        return IOrderBusiness.super.getTotalRevenue(orders);
    }
}
