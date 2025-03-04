import java.util.HashSet;
import java.util.Scanner;
public class bt7 {
        public static boolean isHappy(int num) {
            HashSet<Integer> seen = new HashSet<>();
            while (num != 1 && !seen.contains(num)) {
                seen.add(num);
                num = sumOfSquares(num);
            }
            return num == 1;
        }

        private static int sumOfSquares(int num) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số nguyên dương N: ");
            int N = scanner.nextInt();
            scanner.close();

            System.out.println("Các số Happy từ 1 đến " + N + " là:");
            for (int i = 1; i <= N; i++) {
                if (isHappy(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
