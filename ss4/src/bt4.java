import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Nhập số : ");
            int x = scanner.nextInt();
            if (x == 0){
                break;
            }else {
                sum += x ;
            }
        }
        System.out.println("Tổng :" +sum);
    }
}
