package ss17.src;


import java.util.HashSet;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên ngôn ngữ lập trình cần kiểm tra: ");
        String input = scanner.nextLine();

        if (languages.contains(input)) {
            System.out.println(input + " có trong HashSet.");
        } else {
            System.out.println(input + " không có trong HashSet.");
        }
        scanner.close();
    }
}

