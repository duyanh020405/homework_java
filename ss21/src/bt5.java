import java.util.Scanner;

public class bt5 {
    public static void check_number(int n) throws Exception {
        if (n <= 0) {
            throw new ArithmeticException("Số này không thể <= 0");
        }
        if (n == 1) {
            throw new Exception("1 không phải số nguyên tố!");
        }

        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;  // Đếm ước số i
                if (i != n / i) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            throw new Exception(n + " không phải số nguyên tố!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập vào số nguyên: ");
            int n = sc.nextInt();
            check_number(n);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
