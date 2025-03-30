import java.util.Scanner;

public class bt6 {
    public static int parseToInt(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                throw new NumberFormatException("Chuoi co ki tu khong hop le!");

            }
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập một chuỗi số bất kỳ: ");
            String s = sc.nextLine();
            int number = parseToInt(s);
            System.out.println("Số nguyên sau khi chuyển đổi: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
