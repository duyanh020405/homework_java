import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();
        StringBuilder newString = new StringBuilder(input);

        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            if (Character.isDigit(c)) {
                newString.setCharAt(i, '*');
            }
        }
        System.out.println(newString);
        sc.close();
    }
}
