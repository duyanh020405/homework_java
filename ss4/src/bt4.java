import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập toongr số muốn nhập vào :");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i = 0 ; i <= number-1 ; i++){
            System.out.print("Nhập số thứ "+(i+1) + ":");
            int x = scanner.nextInt();
            sum += x;
        }
        System.out.println("Tổng :" +sum);
    }
}
