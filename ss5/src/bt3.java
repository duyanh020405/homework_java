import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng : ");
        int n = sc.nextInt();
        int countEven = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhập số thứ "+(i+1));
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                countEven++;
            }
        }
        System.out.println("Tổng số lượng chẵn "+countEven);
    }
}
