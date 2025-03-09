import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int count = 0;
        if (n <= 0) {
            System.out.println("Kích thước không hợp lệ”");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập số "+(i+1));
                arr[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if(arr[i] %3 == 0) {
                    sum += arr[i];
                    count ++;
                }
            }
            if(count == 0) {
                System.out.println("Không có số nào chia hết cho 3");
            }
            else {
                System.out.println("Tổng :" +sum);
            }

        }
    }
}
