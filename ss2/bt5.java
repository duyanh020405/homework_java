package ss2;
import java.util.Scanner;
public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int n = sc.nextInt();
        System.out.println("Nhap chieu rong");
        int x = sc.nextInt();

        System.out.println("Dien tich hinh chu nhat = " + n*x);
        System.out.println("Chu vi hinh chu nhat ="  + 2 * (n*x));
    }
}
