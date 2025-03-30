import java.io.*;
import java.nio.file.*;
import java.util.List;

public class bt5 {
    public static void main(String[] args) throws IOException {
        String fileName = "input.txt";
        List<String> names = List.of("Văn Lâm", "Tiến Linh", "Xuân Sơn", "Hoàng Đức", "Văn Hậu");

        Files.write(Paths.get(fileName), names);

        String longestName = "";
        for (String name : Files.readAllLines(Paths.get(fileName))) {
            if (name.length() > longestName.length()) longestName = name;
        }

        System.out.println("Tên cầu thủ dài nhất: " + longestName);
        System.out.println("Độ dài: " + longestName.length());
    }
}
