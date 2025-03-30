package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static presentation.ShopManagement.customers;

public class Customer implements IApp {
    static int auto = 0 ;
    int id;
    String name;
    Optional<String> email ;
    private List<Customer> customers;

    public Customer(int id, String name, Optional<String> email, List<Customer> customers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.customers = customers;
    }

    public Customer() {
        this.id = ++auto;
    }

    @Override
    public void inputData(Scanner scanner) {
        this.id = ++auto;
        System.out.print("Name  : ");
        this.name = scanner.nextLine();

        System.out.print("Email  : ");
        String email = scanner.nextLine();
        this.email = email.isEmpty() ? Optional.empty() : Optional.of(email);
    }

    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email.orElse("Khong co email") + "]";
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
