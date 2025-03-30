import java.io.*;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String content = scanner.nextLine();

        // Ghi vào file
        FileWriter writer = new FileWriter("output.txt");
        writer.write(content);
        writer.close();

        // Đọc lại file và hiển thị
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        System.out.println("Nội dung file:");
        System.out.println(reader.readLine());
        reader.close();

        scanner.close();
    }
}
