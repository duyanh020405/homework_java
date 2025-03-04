import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N :");
        int number = scanner.nextInt();
        int total = 0;
        if (number <= 0 ) {
            System.out.println("Số không hợp lệ");
            return;
        }
        else {
            for(int i = 1 ; i <= number ; i++) {
                total +=i;

            }
        };
        System.out.println("Tổng : "+total);
    }
}
