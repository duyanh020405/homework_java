import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên tệp: ");
        File file = new File(scanner.nextLine());

        System.out.println(file.exists() ? "Tệp đã tồn tại!" : (file.createNewFile() ? "Đã tạo tệp thành công!" : "Không thể tạo tệp!"));
        scanner.close();
    }
}
