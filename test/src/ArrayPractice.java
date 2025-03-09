import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] new_arr = new int[n + 1];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập số muốn chèn vào mảng: ");
        int number = sc.nextInt();
        System.out.print("Nhập vị trí: ");
        int index = sc.nextInt();

        if (index < 0 || index > n) {
            System.out.println("Chỉ số không hợp lệ");
        } else {
            for (int i = 0, j = 0; i < n; i++, j++) {
                if (j == index) {
                    new_arr[j] = number;
                    j++;
                }
                new_arr[j] = arr[i];
            }
            if (index == n) {
                new_arr[n] = number;
            }
            System.out.println("Mảng sau khi chèn:");
            for (int num : new_arr) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
