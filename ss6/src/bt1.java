import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một chuỗi bất kỳ: ");
        String input = sc.nextLine();

        String trimmedInput = input.trim();
        String[] words = trimmedInput.split("\\s+");
        int wordCount = words.length;
        System.out.println("Số từ trong chuỗi: " + wordCount);

        sc.close();
    }
}

