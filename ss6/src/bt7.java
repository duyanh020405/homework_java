import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        sc.close();

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        if (email.matches(emailRegex)) {
            String[] parts = email.split("@");
            if (parts.length == 2) {
                String name = parts[0];
                String domain = parts[1];

                System.out.println("Tên người dùng: " + name);
                System.out.println("Tên miền: " + domain);
            }
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }
}
