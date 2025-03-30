package ss9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt9 {
    public static List<BankAccount> listAmount = new ArrayList<BankAccount>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------Menu--------- ");
            System.out.println("1. Them tai khoan");
            System.out.println("2. Them tien vao tai khoan");
            System.out.println("3. Rut tien vao tu khoan");
            System.out.println("4. Giao dich giua 2 tai khoan");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so bankaccount : ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap ten tai khoan :");
                        String name = sc.nextLine();
                        System.out.println("Nhap so tien tai khoan :");
                        int balance = sc.nextInt();
                        sc.nextLine();
                        if (!name.trim().isEmpty() || balance >= 0) {
                            listAmount.add(new BankAccount(name, balance));
                        }
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Nhap ten bank muon them tien  : ");
                    String name = sc.nextLine();
                    for (int i = 0; i < listAmount.size(); i++) {
                        if (listAmount.get(i).getName().equals(name)) {
                            System.out.println("Nhap so tien muon them :");
                            int money_add = sc.nextInt();
                            if (money_add > 0) {
                                listAmount.get(i).setBalance(listAmount.get(i).getBalance() + money_add);
                                System.out.println("Them tien thanh conhg !");
                                break;
                            }
                        } else {
                            System.out.println("Nhap sai ten , vui long thu lai");
                            break;
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhap ten bank muon them tien  : ");
                    String name_out = sc.nextLine();

                    for (int i = 0; i < listAmount.size(); i++) {
                        if (listAmount.get(i).getName().equals(name_out)) {
                            System.out.println("Nhap so tien muon them :");
                            int money_remove = sc.nextInt();
                            if (money_remove <= listAmount.get(i).getBalance() && money_remove > 0) {
                                listAmount.get(i).setBalance(listAmount.get(i).getBalance() - money_remove);
                                System.out.println("Them tien thanh conhg !");
                                break;
                            }
                            else {
                                System.out.println("So tien qua lon hoac loi du lieu , vui long thu lai");
                            }
                        } else {
                            System.out.println("Nhap sai ten , vui long thu lai");
                            break;
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();
                    Transfer.transfer(sc);
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh!!");
                    System.exit(0);
                default:
                   System.out.println("Nhap sai , vui long thu lai!!");
            }


        }
        while (true);
    }
}
