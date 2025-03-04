import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n :");
        int n = scanner.nextInt();
        if (n >= 0 || n <= 10) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(n + "*" + j + " = " + (n * j));
            }
        }
        else {
            System.err.println("Số không hợp lệ");
        }
    }
}
