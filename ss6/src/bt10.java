import java.util.ArrayList;
import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập input:");
        String str = sc.nextLine().trim();

        String[] words = str.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");

        ArrayList<String> list_word = new ArrayList<>();
        ArrayList<String> list_numbers = new ArrayList<>();

        boolean hasLetter = false;
        boolean hasNumber = false;

        for (String word : words) {
            if (word.matches("[0-9]+")) {
                list_numbers.add(word);
                hasNumber = true;
            } else if (word.matches("[a-zA-Z]+")) {
                list_word.add(word);
                hasLetter = true;
            }
        }

        if (hasLetter && hasNumber) {
            System.out.println("Chuan hoa van ban");
            list_word.forEach(System.out::println);
            System.out.println("Danh sach so");
            list_numbers.forEach(System.out::println);
        } else if (hasLetter) {
            System.out.println("Chuan hoa van ban");
            list_word.forEach(System.out::println);
            System.out.println("Danh sach so");
            System.out.println("N/A");
        } else if (hasNumber) {
            System.out.println("Chuan hoa van ban");
            System.out.println("Khong co van ban de xu ly");
            System.out.println("Danh sach so");
            list_numbers.forEach(System.out::println);
        } else {
            System.out.println("Chuan hoa van ban");
            System.out.println("Khong co van ban de xu ly");
            System.out.println("Danh sach so");
            System.out.println("N/A");
        }

        sc.close();
    }
}
