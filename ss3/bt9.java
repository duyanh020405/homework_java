package ss3;
import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số (100-999): ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;

            System.out.println(convertToWords(hundreds, tens, units));
        }

        scanner.close();
    }

    public static  String convertToWords(int hundreds, int tens, int units) {
        String words = "";
        words += getWord(hundreds) + " trăm ";

        if (tens == 0 && units != 0) {
            words += "lẻ " + getWord(units);
        } else if (tens == 1) {
            words += getTeenWord(units);
        } else {
            words += getTensWord(tens);
            if (units != 0) {
                words += (units == 5) ? " lăm" : " " + getWord(units);
            }
        }

        return words.trim();
    }

    public static String getWord(int num) {
        if (num == 1) return "Một";
        if (num == 2) return "Hai";
        if (num == 3) return "Ba";
        if (num == 4) return "Bốn";
        if (num == 5) return "Năm";
        if (num == 6) return "Sáu";
        if (num == 7) return "Bảy";
        if (num == 8) return "Tám";
        if (num == 9) return "Chín";
        return "";
    }

    public static String getTeenWord(int num) {
        if (num == 0) return "Mười";
        if (num == 1) return "Mười một";
        if (num == 2) return "Mười hai";
        if (num == 3) return "Mười ba";
        if (num == 4) return "Mười bốn";
        if (num == 5) return "Mười lăm";
        if (num == 6) return "Mười sáu";
        if (num == 7) return "Mười bảy";
        if (num == 8) return "Mười tám";
        if (num == 9) return "Mười chín";
        return "";
    }

    public static String getTensWord(int num) {
        if (num == 2) return "Hai mươi";
        if (num == 3) return "Ba mươi";
        if (num == 4) return "Bốn mươi";
        if (num == 5) return "Năm mươi";
        if (num == 6) return "Sáu mươi";
        if (num == 7) return "Bảy mươi";
        if (num == 8) return "Tám mươi";
        if (num == 9) return "Chín mươi";
        return "";
    }
}
