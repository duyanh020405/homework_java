package business;

import entity.Customer;
import presentation.ShopManagement;

import java.util.Scanner;

public class CustomerBusiness {
    public static Customer addCustomer(Scanner scanner){
        int id = 0 ;
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        System.out.print("Enter email : ");
        String email = scanner.nextLine();
        return new Customer();
    }
    public static void displayCustomers(){

    }
}
