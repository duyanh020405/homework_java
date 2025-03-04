import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n để kiểm tra:");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 2) {
            System.out.println("Đây không phải số nguyên tố");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải số nguyên tố");
        }
    }
}
