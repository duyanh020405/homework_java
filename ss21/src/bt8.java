import java.util.Scanner;

class InvalidPhoneNumberLengthException extends Exception {
    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException {
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại phải có đúng 10 chữ số!");
        }
        if (!phone.matches("\\d+")) {
            throw new InvalidPhoneNumberLengthException("Số điện thoại chỉ được chứa các chữ số!");
        }
    }
}

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine().trim();
        try {
            InvalidPhoneNumberLengthException.validatePhoneNumber(phone);
            System.out.println(" Số điện thoại hợp lệ: " + phone);
        } catch (InvalidPhoneNumberLengthException e) {
            System.out.println(" Lỗi: " + e.getMessage());
        }
        scanner.close();
    }
}
