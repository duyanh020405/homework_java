import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi ban đầu: ");
        StringBuilder str = new StringBuilder(scanner.nextLine());

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    str.reverse();
                    System.out.println("Chuỗi sau khi đảo ngược: " + str);
                    break;
                case 2:
                    System.out.print("Nhập chuỗi con cần chèn: ");
                    String subStr = scanner.nextLine();
                    System.out.print("Nhập vị trí chèn: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    if (pos >= 0 && pos <= str.length()) {
                        str.insert(pos, subStr);
                        System.out.println("Chuỗi sau khi chèn: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí bắt đầu xóa: ");
                    int start = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    int end = scanner.nextInt();
                    scanner.nextLine();
                    if (start >= 0 && end <= str.length() && start < end) {
                        str.delete(start, end);
                        System.out.println("Chuỗi sau khi xóa: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 4:
                    System.out.print("Nhập vị trí bắt đầu thay thế: ");
                    int replaceStart = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc: ");
                    int replaceEnd = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replaceStr = scanner.nextLine();
                    if (replaceStart >= 0 && replaceEnd <= str.length() && replaceStart < replaceEnd) {
                        str.replace(replaceStart, replaceEnd, replaceStr);
                        System.out.println("Chuỗi sau khi thay thế: " + str);
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;
                case 5:
                    System.out.println("1. Chuyển thành chữ hoa");
                    System.out.println("2. Chuyển thành chữ thường");
                    System.out.print("Lựa chọn: ");
                    int convertChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (convertChoice == 1) {
                        str = new StringBuilder(str.toString().toUpperCase());
                    } else if (convertChoice == 2) {
                        str = new StringBuilder(str.toString().toLowerCase());
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    System.out.println("Chuỗi sau khi chuyển đổi: " + str);
                    break;
                case 6:
                    System.out.println("Thoát chương trình.!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
}
