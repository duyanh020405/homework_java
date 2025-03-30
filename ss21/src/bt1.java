import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập số a: ");
            int n = sc.nextInt();
            System.out.print("Nhập số b: ");
            int m = sc.nextInt();
            int result = n / m;
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        } catch (Exception e) {
            System.out.println("Lỗi: Dữ liệu nhập không hợp lệ.");
        } finally {
            sc.close();
        }
    }
}
