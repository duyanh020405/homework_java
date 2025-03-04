package ss2;

import java.math.BigInteger;
import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên lớn thứ nhât và thứ 2 thứ");
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();
        sc.nextLine();
        BigInteger num1 = new BigInteger(number1);
        BigInteger num2 = new BigInteger(number2);
        System.out.println("CHỌN TÁC VỤ");
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Nhân");
        System.out.println("4.Chia");
        System.out.println("5.Lũy thừa");
        System.out.println("6.Modulo");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                BigInteger num3 = num1.add(num2);
                System.out.println("Tổng : "+num3);
                break;
            case 2:
                BigInteger num4 = num1.subtract(num2);
                System.out.println("Hieu :"+num4);
                break;
            case 3:
                BigInteger num5 = num1.multiply(num2);
                System.out.println("Tich : "+num5);
                break;
            case 4:
                BigInteger num6 = num1.divide(num2);
                System.out.println("Thuong : "+num6);
                break;
            case 5:
                int num7 = num1.intValueExact(); // chuyển sang int
                try {
                    BigInteger num8 = num1.pow(num7);
                    System.out.println("luy thua : "+ num8);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Số mũ quá lớn, không thể tính!");
                }
                break;
            case 6:
                if (num2.equals(BigInteger.ZERO)) {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                } else {
                    BigInteger result = num1.mod(num2);
                    System.out.println("Số dư (modulo): " + result);
                }
                break;
        }
        sc.close();
    }
}
