import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        System.out.println("Các số hoàn hảo nhỏ hơn " + n + " là:");

        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    sum += k;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
