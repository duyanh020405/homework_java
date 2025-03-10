import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String word = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (i == 0) {
                result.append(Character.toLowerCase(ch));
            }
            else if (Character.isUpperCase(ch)) {
                result.append("_");
                result.append(Character.toLowerCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
