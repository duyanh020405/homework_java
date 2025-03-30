import java.io.*;
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nội dung: ");

        try (FileWriter w = new FileWriter("input.txt")) {
            w.write(scanner.nextLine());
        }

        try (FileReader r = new FileReader("input.txt");
             FileWriter w = new FileWriter("copy.txt")) {
            int c;
            while ((c = r.read()) != -1) w.write(c);
        }

        System.out.println("Nội dung file copy.txt:");
        try (BufferedReader r = new BufferedReader(new FileReader("copy.txt"))) {
            r.lines().forEach(System.out::println);
        }

        scanner.close();
    }
}
