import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];
        if (n <= 0) {
            System.out.println("Kích thước không hợp lệ”");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập số "+(i+1));
                arr[i] = sc.nextInt();
                 max = arr[0];
                 min = arr[0];
                for (int j = 0; j < n; j++) {
                    if(arr[j] > max){
                        max = arr[j];
                    }
                }
                for (int j = 0; j < n; j++) {
                    if(min > arr[j]){
                        min = arr[j];
                    }
                }
            }
            System.out.printf("Min : " + min);
            System.out.println("Max : " + max);
        }
    }
}
