package entity;

import presentation.ShopManagement;

import java.util.Scanner;

import static presentation.ShopManagement.customers;

public class Order implements IApp {
    int  id= 0;
    Customer customer;
    Scanner orderDate;
    boolean status;

    public Order(int id, Customer customer, Scanner orderDate) {
        this.id = id++;
        this.customer = customer;
        this.orderDate = orderDate;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Scanner getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Scanner orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Customer inputdata(Scanner scanner) {
        customers.
        return null;
    }

    public String toString() {
        return "Oder : "+id+" from Customer : (id=" + customer.id + ", name=" + customer.name + ", email=" + customer.email + ")";
    }
}
