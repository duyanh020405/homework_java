package business;

import entity.Customer;

import java.util.Scanner;

import static presentation.ShopManagement.customers;

public class CustomerBusiness {
    public static void addCustomer(Scanner scanner){
        System.out.print("Nhap so khach hang muon them :");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            Customer customer = new Customer();
            customer.inputData(scanner);
            customers.add(customer);
        }
    }

    public static void displayCustomers(){
        for(Customer customer : customers){
            System.out.println(customer.toString());
        }
    }
}
