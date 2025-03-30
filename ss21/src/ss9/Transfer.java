package ss9;

import java.io.IOException;
import java.util.Scanner;

public class Transfer {
    public static void transfer(Scanner sc) throws Exception {
        System.out.println("Nhap ten tai khoan muon chuyen di :");
        String from = sc.next();
        System.out.println("Nhap ten tai khoan muon them vao :");
        String to = sc.next();
        System.out.println("Nhap so tien muon giao dich :");
        int amount = sc.nextInt();
        boolean check = true;
        for(int i = 0 ; i < bt9.listAmount.size() ; i++) {
            if((bt9.listAmount.get(i).getName().equals(from)) && bt9.listAmount.get(i).getBalance() >= amount){
                bt9.listAmount.get(i).setBalance(bt9.listAmount.get(i).getBalance() - amount);
                for(int j = 0 ; j < bt9.listAmount.size() ; j++){
                    if((bt9.listAmount.get(i).getName().equals(to))){
                        bt9.listAmount.get(i).setBalance(bt9.listAmount.get(i).getBalance() + amount);
                        System.out.println("Giao dich thanh cong !!!!");
                    }
                }
            }
            else {
                check = false;
                throw new Exception("Khong tim thay nguoi chuyen tien !!");

            }
        }
    }
}
