package presentation;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    static List<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ;
        int size = 0 ;
        do {
            System.out.println("**********************SHOP MENU*******************");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do{
                        System.out.println("1. Danh sách khách hàng");
                        System.out.println("2. Thêm mới khách hàng");
                        int choice1 = scanner.nextInt();
                        switch (choice1) {

                            case 1 :
                                if(size == 0){
                                    System.out.println("Khong co khach hang nao");
                                    break;
                                }
                                else {
                                    for(Customer customer : customers){
                                        System.out.println("Ten :"+customer.getName());
                                        break;
                                    }
                                }
                        case 2:
                            Customer customer_info =new Customer().inputdata(scanner);
                            customers.add(customer_info);
                            size++;
                            break;

                    }

                }
                while (true);
            }

        }
        while (true);
    }
}

