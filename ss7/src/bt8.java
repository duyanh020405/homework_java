import java.util.Random;
import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài chuỗi: ");
        int n = sc.nextInt();
        sc.close();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            output.append(characters.charAt(index));
        }

        System.out.println("Chuỗi ngẫu nhiên: " + output.toString());
    }
}
