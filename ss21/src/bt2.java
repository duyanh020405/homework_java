import java.util.Scanner;


public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so phan tu :");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap so :");
                arr[i] = sc.nextInt();
            }
            System.out.println("Nhap so index tim kiem  :");
            int k = sc.nextInt();

            System.out.println("so cua index :"+arr[k]);
        }
        catch (ArithmeticException e) {
            System.out.println("Khong co index nay !");
        }
        catch (Exception e) {
            System.out.println("Du lieu khong hop le");
        }
        finally {
            sc.close();
        }
    }
}
