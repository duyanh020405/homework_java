import java.io.*;
import java.nio.file.*;

public class bt6 {
    public static void main(String[] args) throws IOException {
        String fileName = "input.txt";
        String reversedFile = "copy.txt";

        String content = "Hello Java!";
        Files.writeString(Paths.get(fileName), content);

        String reversed = new StringBuilder(Files.readString(Paths.get(fileName))).reverse().toString();
        Files.writeString(Paths.get(reversedFile), reversed);
        System.out.println("Nội dung file copy.txt: " + Files.readString(Paths.get(reversedFile)));
    }
}
