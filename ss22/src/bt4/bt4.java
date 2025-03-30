package bt4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class bt4 {
    public static void main(String[] args) throws Exception {
        String file = "student.dat";
        Student s = new Student("Nguyễn Văn A", 20, 8.5);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(s);
            System.out.println("Đã ghi đối tượng vào " + file);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println("Đã đọc đối tượng từ " + file);
            ((Student) ois.readObject()).display();
        }
    }
}
