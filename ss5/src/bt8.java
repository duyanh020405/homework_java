import java.util.Scanner;

public class bt8 {
    static class Number {
        int value, count = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.err.println("Không hợp lệ, vui lòng nhập số khác");
            return;
        }

        int[] arr = new int[n];
        Number[] numbers = new Number[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            numbers[i] = new Number();
            numbers[i].value = arr[i];
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (arr[i] == arr[j]) {
                    numbers[i].count++;
                }

        System.out.println("Output:");
        int found = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i].count == 1) {
                System.out.println(numbers[i].value);
                found ++;
            }

        if (found != 0) System.out.println("Không có số nào xuất hiện duy nhất.");
        sc.close();
    }
}
