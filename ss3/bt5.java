package ss3;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu 1 :");
        int number1 = sc.nextInt();
        System.out.println("Nhap phep tinh muon lam :");
        String use = sc.next();
        System.out.println("Nhap so 2 :");
        int number2 = sc.nextInt();
        int total = 0;

        if(use.equals("+")) {
            total = number1 + number2;
        }
        else if(use.equals("-")) {
            total = number1 - number2;
        } else if (use.equals("*")) {
            total = number1 * number2;
        } else if (use.equals("/")) {
            if (number2 != 0) {
                total = number1 / number2;
            } else {
                System.out.println("Khong the chia cho 0.");
                return;
            }
        }
        else {
            System.out.println("Nhap khong hop le , vui long thu lai:");
            return;
        }
        System.out.println("Ket qua: " + total);
    }
}
