package btvn;

import java.util.ArrayList;
import java.util.Iterator;

public class bt1 {
public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Nguyễn Văn A");
        students.add("Trần Thị B");
        students.add("Lê Văn C");
        students.add("Phạm Thị D");
        students.add("Hoàng Văn E");

        System.out.println("Duyệt danh sách bằng vòng lặp for:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("Duyệt danh sách bằng vòng lặp foreach:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Duyệt danh sách bằng Iterator:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
}
