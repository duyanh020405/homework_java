import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email :");
        String email = sc.nextLine();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        if (email.matches(emailRegex)) {
            System.out.println("Hợp lệ ");
        }
        else {
            System.out.println("Không hợp lệ");
        }
        sc.close();
    }
}
