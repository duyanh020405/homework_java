import java.util.Scanner;

public class bt7 {
    public static void check_amount(String n, int amount) throws Exception {
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))) {
                throw new NumberFormatException("Vui lòng nhập đúng số!");
            }
        }
        int num = Integer.parseInt(n);
        if (amount - num < 50000) {
            throw new Exception("Tài khoản của quý khách nên >= 50.000đ");
        } else {
            System.out.println("Rút tiền thành công!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 1000000;

        try {
            System.out.print("Nhập số tiền muốn rút: ");
            String s = sc.nextLine();
            check_amount(s, amount);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
