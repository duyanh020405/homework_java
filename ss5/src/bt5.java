import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Kích thước mảng không hợp lệ!");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử số " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        Integer min = null, max = null;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                if (min == null || arr[i] < min) {
                    min = arr[i];
                }
                if (max == null || arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        if (min == null || max == null) {
            System.out.println("Không có số lẻ dương trong mảng.");
        } else {
            System.out.println("Số lẻ dương nhỏ nhất: " + min);
            System.out.println("Số lẻ dương lớn nhất: " + max);
        }

        sc.close();
    }
}
