package ss3;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn số 1 -> 7 để in ra ngày:");
        int choice = sc.nextInt();
        if(choice <= 7 && choice >= 1){
            switch (choice) {
                case 1:
                    System.out.println("Chu nhat");
                    break;
                case 2:
                    System.out.println("Thu 2");
                    break;
                case 3:
                    System.out.println("Thu 3");
                    break;
                case 4:
                    System.out.println("Thu 4");
                    break;
                case 5:
                    System.out.println("Thu 5");
                    break;
                case 6:
                    System.out.println("Thu 6");
                    break;
                case 7:
                    System.out.println("Thu 7");
                    break;
                default:
                    System.out.println("Số không hợ lệ");
                    break;
            }

        }
        else {
            System.out.println("Nhap khong hop le , vui long thu lai");
        }

    }

}
