import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng kích thước mảng");
        int n = sc.nextInt();
        if (n <1){
            System.err.println("Số không hợp lệ , vui lòng thử lại");
        }
        else{
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập số thứ " + (i+1));
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Sum = " + sum);
        }
    }
}
