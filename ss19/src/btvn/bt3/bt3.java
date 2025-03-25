package btvn.bt3;

import java.util.Scanner;
import java.util.function.BiFunction;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.println("Tổng: " + MathOperations.add(a,b));
        System.out.println("Hiệu: " + MathOperations.subtract(a, b));
        System.out.println("Tích: " + MathOperations.multiply(a, b));
        System.out.println("Thuong: " + MathOperations.divide(a, b));


        scanner.close();
    }
}
