import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng mảng :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(arr.length == 0){
            System.err.println("Kích thước rỗng");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập phần tử số "+ (i+1));
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n / 2; i++) {
                int sum = arr[i] + arr[n-i-1];
                arr[i] = sum - arr[i];
                arr[n-i-1] = sum - arr[n-i-1];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
